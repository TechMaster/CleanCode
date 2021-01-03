package registration.model;

import lombok.extern.slf4j.Slf4j;

// Factory method pattern: Concrete product
@Slf4j
public class Member extends User {

    public Member(UserInfo userInfo) {
        super(userInfo);
    }

    @Override
    public void register() {
        log.info("Register member {}", userInfo);
    }
}
