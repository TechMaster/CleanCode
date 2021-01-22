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
import todolist.dto.UserReqDto;
import todolist.dto.UserResDto;
import todolist.service.UserService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/api/v1/users")
    @ApiOperation("Get users")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Get users successfully")
    })
    public ResponseEntity<CollectionModel<UserResDto>> getUsers() {
        List<UserResDto> response = userService.getUsers();

        response.forEach(userResDto -> userResDto.add(HateoasLinkFactory.createUserLinks(userResDto.getId())));
        CollectionModel<UserResDto> collectionModel = CollectionModel.of(response);

        return new ResponseEntity<>(collectionModel, HttpStatus.OK);
    }

    @GetMapping("/api/v1/users/{userId}")
    @ApiOperation("Get user by user ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Get user successfully"),
            @ApiResponse(code = 404, message = "User not found")
    })
    public ResponseEntity<EntityModel<UserResDto>> getUser(
            @ApiParam(value = "User ID", example = "123") @PathVariable(value = "userId") Integer userId
    ) {
        UserResDto response = userService.getUser(userId);

        EntityModel<UserResDto> entityModel = EntityModel.of(response);
        entityModel.add(HateoasLinkFactory.createUserLinks(userId));

        return new ResponseEntity<>(entityModel, HttpStatus.OK);
    }

    @GetMapping("/api/v1/users/{userId}/tasks")
    @ApiOperation("Get tasks of user by user ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Get tasks successfully"),
            @ApiResponse(code = 404, message = "User not found")
    })
    public ResponseEntity<CollectionModel<TaskDto>> getTasksOfUser(
            @ApiParam(value = "User ID", example = "123") @PathVariable(value = "userId") Integer userId
    ) {
        List<TaskDto> response = userService.getTasksOfUser(userId);

        response.forEach(taskDto -> taskDto.add(HateoasLinkFactory.createTaskLinks(taskDto.getId())));
        CollectionModel<TaskDto> collectionModel = CollectionModel.of(response);

        return new ResponseEntity<>(collectionModel, HttpStatus.OK);
    }

    @PostMapping("/api/v1/users")
    @ApiOperation("Create user")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Create user successfully")
    })
    public ResponseEntity<UserResDto> createUser(@Valid @RequestBody UserReqDto userReqDto) {
        UserResDto response = userService.saveUser(userReqDto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PutMapping("/api/v1/users")
    @ApiOperation("Update user")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Update user successfully"),
            @ApiResponse(code = 404, message = "User not found")
    })
    public ResponseEntity<UserResDto> updateUser(@Valid @RequestBody UserReqDto userReqDto) {
        UserResDto response = userService.saveUser(userReqDto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/api/v1/users/{userId}")
    @ApiOperation("Delete user by user ID")
    @ApiResponses({
            @ApiResponse(code = 204, message = "Delete user successfully"),
            @ApiResponse(code = 404, message = "User not found")
    })
    public ResponseEntity<Void> deleteUser(@PathVariable(value = "userId") Integer userId) {
        userService.deleteUser(userId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/api/v1/users")
    @ApiOperation("Delete all users")
    @ApiResponses({
            @ApiResponse(code = 204, message = "Delete all users successfully"),
    })
    public ResponseEntity<Void> deleteAllUsers() {
        userService.deleteAllUsers();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
