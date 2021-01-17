package todolist.service;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import todolist.dto.TaskDtoV1;
import todolist.dto.TaskDtoV2;
import todolist.entity.Task;
import todolist.repository.TaskRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;
    private final ModelMapper modelMapper;

    @Transactional(readOnly = true)
    public List<TaskDtoV1> getTasksV1() {
        List<Task> tasks = taskRepository.findAll();
        return tasks
                .stream()
                .map(task -> modelMapper.map(task, TaskDtoV1.class))
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<TaskDtoV2> getTasksV2() {
        List<Task> tasks = taskRepository.findAll();
        return tasks
                .stream()
                .map(task -> modelMapper.map(task, TaskDtoV2.class))
                .collect(Collectors.toList());
    }

}
