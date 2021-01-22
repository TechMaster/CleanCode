package todolist.controller;

import org.springframework.hateoas.IanaLinkRelations;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

import java.util.Arrays;
import java.util.List;

public class HateoasLinkFactory {

    private HateoasLinkFactory() {
    }

    public static List<Link> createSimpleTaskLinks(Integer taskId) {
        Link selfLink = Link.of(String.format("http://localhost:8080/api/v1/tasks/%d", taskId),
                IanaLinkRelations.SELF);
        Link updateLink = Link.of("http://localhost:8080/api/v1/tasks",
                "update");
        Link deleteLink = Link.of(String.format("http://localhost:8080/api/v1/tasks/%d", taskId),
                "delete");
        return Arrays.asList(selfLink, updateLink, deleteLink);
    }

    public static List<Link> createTaskLinks(Integer taskId) {
        Link selfLink = WebMvcLinkBuilder.linkTo(
                WebMvcLinkBuilder
                        .methodOn(TaskController.class)
                        .getTask(taskId))
                .withSelfRel();

        Link updateLink = WebMvcLinkBuilder.linkTo(
                WebMvcLinkBuilder
                        .methodOn(TaskController.class)
                        .updateTask(null))
                .withRel("update");

        Link deleteLink = WebMvcLinkBuilder.linkTo(
                WebMvcLinkBuilder
                        .methodOn(TaskController.class)
                        .deleteTask(taskId))
                .withRel("delete");

        return Arrays.asList(selfLink, updateLink, deleteLink);
    }

    public static List<Link> createSimpleUserLinks(Integer userId) {
        Link selfLink = Link.of(String.format("http://localhost:8080/api/v1/users/%d", userId),
                IanaLinkRelations.SELF);
        Link updateLink = Link.of("http://localhost:8080/api/v1/users",
                "update");
        Link deleteLink = Link.of(String.format("http://localhost:8080/api/v1/users/%d", userId),
                "delete");
        Link tasksLink = Link.of(String.format("http://localhost:8080/api/v1/users/%d/tasks", userId),
                "tasks");
        return Arrays.asList(selfLink, updateLink, deleteLink, tasksLink);
    }

    public static List<Link> createUserLinks(Integer userId) {
        Link selfLink = WebMvcLinkBuilder.linkTo(
                WebMvcLinkBuilder
                        .methodOn(UserController.class)
                        .getUser(userId))
                .withSelfRel();

        Link updateLink = WebMvcLinkBuilder.linkTo(
                WebMvcLinkBuilder
                        .methodOn(UserController.class)
                        .updateUser(null))
                .withRel("update");

        Link deleteLink = WebMvcLinkBuilder.linkTo(
                WebMvcLinkBuilder
                        .methodOn(UserController.class)
                        .deleteUser(userId))
                .withRel("delete");

        Link tasksLink = WebMvcLinkBuilder.linkTo(
                WebMvcLinkBuilder
                        .methodOn(UserController.class)
                        .getTasksOfUser(userId))
                .withRel("tasks");

        return Arrays.asList(selfLink, updateLink, deleteLink, tasksLink);
    }

}
