package todolist.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * Request DTO
 */
@Data
public class UserReqDto {

    @ApiModelProperty(value = "User ID", example = "1")
    private Integer id;

    @NotBlank
    @ApiModelProperty(value = "User name", example = "XYZ")
    private String name;

    @NotBlank
    @ApiModelProperty(value = "User email", example = "xyz@gmail.com")
    private String email;

    @NotBlank
    @ApiModelProperty(value = "User password", example = "123456")
    private String password;

}
