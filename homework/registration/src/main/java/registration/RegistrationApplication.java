package registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import registration.dto.RegisterDto;
import registration.enums.Gender;
import registration.enums.RegisterMode;
import registration.service.RegistrationService;

@SpringBootApplication
public class RegistrationApplication implements CommandLineRunner {

	@Autowired
	private RegistrationService registrationService;

	public static void main(String[] args) {
		SpringApplication.run(RegistrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		RegisterDto registerAdminDto = new RegisterDto();
		registerAdminDto.setName("Alice");
		registerAdminDto.setEmail("alice@gmail.com");
		registerAdminDto.setAge(18);
		registerAdminDto.setGender(Gender.FEMALE);
		registerAdminDto.setMode(RegisterMode.ADMIN);
		registrationService.register(registerAdminDto);

		RegisterDto registerMemberDto = new RegisterDto();
		registerMemberDto.setName("Bob");
		registerMemberDto.setEmail("bob@gmail.com");
		registerMemberDto.setAge(19);
		registerMemberDto.setGender(Gender.MALE);
		registerMemberDto.setMode(RegisterMode.MEMBER);
		registrationService.register(registerMemberDto);
	}
}
