package cv.before;

import cv.before.export.ResumeFormat;
import cv.before.model.CreateResumeRequest;
import cv.before.model.UserInfo;
import cv.before.template.TemplateType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication(scanBasePackages = "cv.before")
public class ResumeApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ResumeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ResumeService resumeService = new ResumeService();

        CreateResumeRequest request1 = new CreateResumeRequest();
        UserInfo userInfo1 = new UserInfo("Alice", "/path/to/alice", 4,
                Arrays.asList("JAVA", "HIBERNATE", "SPRING"));
        request1.setUserInfo(userInfo1);
        request1.setTemplateType(TemplateType.BLUE);
        request1.setResumeFormat(ResumeFormat.PDF);
        resumeService.createResume(request1);

        CreateResumeRequest request2 = new CreateResumeRequest();
        UserInfo userInfo2 = new UserInfo("Alice", null, null,
                Arrays.asList("JS", "ANGULAR"));
        request2.setUserInfo(userInfo2);
        request2.setTemplateType(TemplateType.RED);
        request2.setResumeFormat(ResumeFormat.WORD);
        resumeService.createResume(request2);
    }

}
