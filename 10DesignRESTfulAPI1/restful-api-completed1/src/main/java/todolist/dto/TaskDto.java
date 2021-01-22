package todolist.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class TaskDto extends RepresentationModel<TaskDto> {

    @ApiModelProperty(value = "Task ID", example = "1")
    private Integer id;

    @NotBlank
    @ApiModelProperty(value = "Task title", example = "Learning")
    private String title;

    @NotNull
    @ApiModelProperty(value = "Task priority", example = "10")
    private Integer priority;

}
