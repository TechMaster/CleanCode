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

    private UserInfo(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.gender = builder.gender;
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

    public static class Builder {
        private String id;

        private String name;

        private String email;

        private int age;

        private Gender gender;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder gender(Gender gender) {
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

        public UserInfo build2() {
            return new UserInfo(this);
        }
    }

}
