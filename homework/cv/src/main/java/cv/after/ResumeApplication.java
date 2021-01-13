package cv.after;

import cv.after.export.ResumeFormat;
import cv.after.model.CreateResumeRequest;
import cv.after.model.UserInfo;
import cv.after.template.TemplateType;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@RequiredArgsConstructor
@SpringBootApplication(scanBasePackages = "cv.after")
public class ResumeApplication implements CommandLineRunner {

    private final ResumeService resumeService;

    public static void main(String[] args) {
        SpringApplication.run(ResumeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        CreateResumeRequest request1 = new CreateResumeRequest();
        UserInfo userInfo1 = new UserInfo.Builder()
                .name("Alice")
                .image("/path/to/alice")
                .experiences(4)
                .skills(Arrays.asList("JAVA", "HIBERNATE", "SPRING"))
                .build();
        request1.setUserInfo(userInfo1);
        request1.setTemplateType(TemplateType.BLUE);
        request1.setResumeFormat(ResumeFormat.PDF);
        resumeService.createResume(request1);

        CreateResumeRequest request2 = new CreateResumeRequest();
        UserInfo userInfo2 = new UserInfo.Builder()
                .name("Alice")
                .skills(Arrays.asList("JAVA", "HIBERNATE", "SPRING"))
                .build();
        request2.setUserInfo(userInfo2);
        request2.setTemplateType(TemplateType.RED);
        request2.setResumeFormat(ResumeFormat.WORD);
        resumeService.createResume(request1);
    }
}
