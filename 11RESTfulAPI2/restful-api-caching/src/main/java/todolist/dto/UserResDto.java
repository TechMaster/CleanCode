package todolist.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;

import javax.validation.constraints.NotBlank;

/**
 * Response DTO
 */
@Data
public class UserResDto extends RepresentationModel<UserResDto> {

    @ApiModelProperty(value = "User ID", example = "1")
    private Integer id;

    @NotBlank
    @ApiModelProperty(value = "User name", example = "XYZ")
    private String name;

}
