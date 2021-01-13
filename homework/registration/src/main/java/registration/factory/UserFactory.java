package registration.factory;

import org.springframework.stereotype.Component;
import registration.dto.RegisterDto;
import registration.enums.RegisterMode;
import registration.model.Admin;
import registration.model.Member;
import registration.model.User;
import registration.model.UserInfo;

import java.util.UUID;

/**
 * Factory method pattern: Creator
 */
@Component
public class UserFactory {

    public User createUser(RegisterDto dto) {
        if (dto.getMode() == RegisterMode.ADMIN) {
            return createAdmin(dto);
        } else if (dto.getMode() == RegisterMode.MEMBER) {
            return createMember(dto);
        } else {
            throw new UnsupportedOperationException("Unsupported register mode");
        }
    }

    private User createAdmin(RegisterDto dto) {
        UserInfo.Builder userBuilder = new UserInfo.Builder();
        map(userBuilder, dto);
        userBuilder.id("admin-" + randomId());
        UserInfo userInfo = userBuilder.build();
        return new Admin(userInfo);
    }

    private User createMember(RegisterDto dto) {
        UserInfo.Builder userBuilder = new UserInfo.Builder();
        map(userBuilder, dto);
        userBuilder.id("member-" + randomId());
        UserInfo userInfo = userBuilder.build();
        return new Member(userInfo);
    }

    private void map(UserInfo.Builder builder, RegisterDto dto) {
        builder
            .name(dto.getName())
            .email(dto.getEmail())
            .age(dto.getAge())
            .gender(dto.getGender());
    }

    private String randomId() {
        return UUID.randomUUID().toString();
    }

}
