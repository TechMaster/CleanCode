package todolist.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class TaskDtoV1 {

    private Integer id;

    @NotBlank
    private String title;

    @NotNull
    private Integer priority;

}
