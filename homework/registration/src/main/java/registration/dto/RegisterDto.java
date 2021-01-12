package registration.dto;

import lombok.Data;
import registration.enums.Gender;
import registration.enums.RegisterMode;

@Data
public class RegisterDto {

    private String name;

    private String email;

    private int age;

    private Gender gender;

    private RegisterMode mode;

}
