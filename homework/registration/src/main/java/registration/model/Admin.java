package registration.model;

import lombok.extern.slf4j.Slf4j;

// Factory method pattern: Concrete product
@Slf4j
public class Admin extends User {

    public Admin(UserInfo userInfo) {
        super(userInfo);
    }

    @Override
    public void register() {
        log.info("Register admin {}", userInfo);
    }
}
