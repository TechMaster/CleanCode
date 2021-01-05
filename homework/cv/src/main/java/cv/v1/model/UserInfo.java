package cv.v1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class UserInfo {

    private String name;

    private String image;

    private Integer experiences;

    private List<String> skills;

}
