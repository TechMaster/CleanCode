package registration.model;

import registration.enums.Gender;

/**
 * Using Builder pattern here
 */
public class UserInfo {

    private String id;

    private String name;

    private String email;

    private int age;

    private Gender gender;

    private UserInfo() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public static class UserBuilder {
        private String id;

        private String name;

        private String email;

        private int age;

        private Gender gender;

        public UserBuilder id(String id) {
            this.id = id;
            return this;
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public UserInfo build() {
            UserInfo userInfo = new UserInfo();
            userInfo.id = this.id;
            userInfo.name = this.name;
            userInfo.email = this.email;
            userInfo.age = this.age;
            userInfo.gender = this.gender;
            return userInfo;
        }
    }

}
