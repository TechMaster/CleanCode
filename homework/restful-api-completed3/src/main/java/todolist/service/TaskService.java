package todolist.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import todolist.dto.TaskDto;
import todolist.entity.Task;
import todolist.error.ErrorCodes;
import todolist.error.ServiceRuntimeException;
import todolist.repository.TaskRepository;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;
    private final ModelMapper modelMapper;

    @Transactional(readOnly = true)
    public List<TaskDto> getTasks() {
        List<Task> tasks = taskRepository.findAll();
        return tasks
                .stream()
                .map(task -> modelMapper.map(task, TaskDto.class))
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    @Cacheable(value = "tasks", key = "#taskId")
    public TaskDto getTask(Integer taskId) {
        Task task = taskRepository.findById(taskId)
                .orElseThrow(() -> new ServiceRuntimeException(
                        HttpStatus.NOT_FOUND,
                        ErrorCodes.TASK_E001,
                        String.format("Task not found: #%s", taskId)));
        return modelMapper.map(task, TaskDto.class);
    }

    @Transactional
    @CachePut(value = "tasks", key = "#result.id")
    public TaskDto saveTask(TaskDto taskDto) {
        Task task;
        if (Objects.isNull(taskDto.getId())) {
            task = new Task();
        } else {
            task = taskRepository.findById(taskDto.getId())
                    .orElseThrow(() -> new ServiceRuntimeException(
                            HttpStatus.NOT_FOUND,
                            ErrorCodes.TASK_E001,
                            String.format("Task not found: #%s", taskDto.getId())));
        }
        modelMapper.map(taskDto, task);
        Task savedTask = taskRepository.save(task);
        return modelMapper.map(savedTask, TaskDto.class);
    }

    @Transactional
    @CacheEvict(value = "tasks", key = "#taskId")
    public void deleteTask(Integer taskId) {
        Task task = taskRepository.findById(taskId)
                .orElseThrow(() -> new ServiceRuntimeException(
                        HttpStatus.NOT_FOUND,
                        ErrorCodes.TASK_E001,
                        String.format("Task not found: #%s", taskId)));
        taskRepository.delete(task);
    }

    @Transactional
    @CacheEvict(value = "tasks", allEntries = true)
    public void deleteAllTasks() {
        taskRepository.deleteAll();
    }

}
