package cv.after.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * Apply Builder pattern here
 */
@Data
@AllArgsConstructor
public class UserInfo {

    private String name;
    private String image;
    private Integer experiences;
    private List<String> skills;

    private UserInfo() {
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public Integer getExperiences() {
        return experiences;
    }

    public List<String> getSkills() {
        return skills;
    }

    public static class Builder {

        private String name;
        private String image;
        private Integer experiences;
        private List<String> skills;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder image(String image) {
            this.image = image;
            return this;
        }

        public Builder experiences(Integer experiences) {
            this.experiences = experiences;
            return this;
        }

        public Builder skills(List<String> skills) {
            this.skills = skills;
            return this;
        }

        public UserInfo build() {
            UserInfo userInfo = new UserInfo();
            userInfo.name = this.name;
            userInfo.image = this.image;
            userInfo.experiences = this.experiences;
            userInfo.skills = this.skills;
            return userInfo;
        }

    }

}
