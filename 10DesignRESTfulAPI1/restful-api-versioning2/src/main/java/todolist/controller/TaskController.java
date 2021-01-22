package todolist.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import todolist.dto.TaskDtoV1;
import todolist.dto.TaskDtoV2;
import todolist.service.TaskService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping(value = "/api/tasks", params = "version=1")
    public ResponseEntity<List<TaskDtoV1>> getTasksV1() {
        List<TaskDtoV1> response = taskService.getTasksV1();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping(value = "/api/tasks", params = "version=2")
    public ResponseEntity<List<TaskDtoV2>> getTasksV2() {
        List<TaskDtoV2> response = taskService.getTasksV2();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
