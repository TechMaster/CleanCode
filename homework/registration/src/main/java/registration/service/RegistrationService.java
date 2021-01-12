package registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import registration.dto.RegisterDto;
import registration.factory.UserFactory;
import registration.model.User;

/**
 * Singleton bean
 */
@Service
public class RegistrationService {

    @Autowired
    private UserFactory userFactory;

    public void register(RegisterDto dto) {
        User user = userFactory.createUser(dto);
        user.register();
    }

}
