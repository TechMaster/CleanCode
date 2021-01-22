package todolist.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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

    @GetMapping(value = "/api/v1/tasks")
    @ApiOperation("Get tasks")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Get tasks successfully")
    })
    public ResponseEntity<CollectionModel<TaskDto>> getTasks() {
        List<TaskDto> response = taskService.getTasks();

        response.forEach(taskDto -> taskDto.add(HateoasLinkFactory.createTaskLinks(taskDto.getId())));
        CollectionModel<TaskDto> collectionModel = CollectionModel.of(response);

        return new ResponseEntity<>(collectionModel, HttpStatus.OK);
    }

    @GetMapping("/api/v1/tasks/{taskId}")
    @ApiOperation("Get task by task ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Get task successfully"),
            @ApiResponse(code = 404, message = "Task not found")
    })
    public ResponseEntity<EntityModel<TaskDto>> getTask(
            @ApiParam(value = "Task ID", example = "123") @PathVariable(value = "taskId") Integer taskId
    ) {
        TaskDto response = taskService.getTask(taskId);

        EntityModel<TaskDto> entityModel = EntityModel.of(response);
        entityModel.add(HateoasLinkFactory.createTaskLinks(taskId));

        return new ResponseEntity<>(entityModel, HttpStatus.OK);
    }

    @PostMapping("/api/v1/tasks")
    @ApiOperation("Create task")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Create task successfully")
    })
    public ResponseEntity<TaskDto> createTask(@Valid @RequestBody TaskDto taskDto) {
        TaskDto response = taskService.saveTask(taskDto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/api/v1/tasks")
    @ApiOperation("Update task")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Update task successfully"),
            @ApiResponse(code = 404, message = "Task not found")
    })
    public ResponseEntity<TaskDto> updateTask(@Valid @RequestBody TaskDto taskDto) {
        TaskDto response = taskService.saveTask(taskDto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/api/v1/tasks/{taskId}")
    @ApiOperation("Delete task by task ID")
    @ApiResponses({
            @ApiResponse(code = 204, message = "Delete task successfully"),
            @ApiResponse(code = 404, message = "Task not found")
    })
    public ResponseEntity<Void> deleteTask(@PathVariable(value = "taskId") Integer taskId) {
        taskService.deleteTask(taskId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/api/v1/tasks")
    @ApiOperation("Delete all tasks")
    @ApiResponses({
            @ApiResponse(code = 204, message = "Delete all tasks successfully"),
    })
    public ResponseEntity<Void> deleteAllTasks() {
        taskService.deleteAllTasks();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
