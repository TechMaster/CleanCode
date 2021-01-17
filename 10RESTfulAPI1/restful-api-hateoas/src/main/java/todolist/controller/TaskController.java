package todolist.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import todolist.dto.TaskDto;
import todolist.service.TaskService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping("/api/v1/tasks")
    public ResponseEntity<CollectionModel<TaskDto>> getTasks() {
        List<TaskDto> response = taskService.getTasks();

        response.forEach(taskDto -> taskDto.add(HateoasLinkFactory.createTaskLinks(taskDto.getId())));
        CollectionModel<TaskDto> collectionModel = CollectionModel.of(response);

        return new ResponseEntity<>(collectionModel, HttpStatus.OK);
    }

    @GetMapping("/api/v1/tasks/{taskId}")
    public ResponseEntity<EntityModel<TaskDto>> getTask(@PathVariable(value = "taskId") Integer taskId) {
        TaskDto response = taskService.getTask(taskId);

        EntityModel<TaskDto> entityModel = EntityModel.of(response);
        entityModel.add(HateoasLinkFactory.createTaskLinks(taskId));

        return new ResponseEntity<>(entityModel, HttpStatus.OK);
    }

    @PostMapping("/api/v1/tasks")
    public ResponseEntity<TaskDto> createTask(@Valid @RequestBody TaskDto taskDto) {
        TaskDto response = taskService.saveTask(taskDto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/api/v1/tasks")
    public ResponseEntity<TaskDto> updateTask(@Valid @RequestBody TaskDto taskDto) {
        TaskDto response = taskService.saveTask(taskDto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/api/v1/tasks/{taskId}")
    public ResponseEntity<Void> deleteTask(@PathVariable(value = "taskId") Integer taskId) {
        taskService.deleteTask(taskId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
