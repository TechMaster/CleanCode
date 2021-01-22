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

}
