package todolist.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class TaskDto {

    private Integer id;

    @NotBlank
    private String title;

    @NotNull
    private Integer priority;

}
