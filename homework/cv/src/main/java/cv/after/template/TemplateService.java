package cv.after.template;

import cv.after.model.UserInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class TemplateService {

    private final Map<String, Template> templates;

    /**
     * Combine template with user info from request
     * @return template as HTML string
     */
    public String combine(ResumeTemplates resumeTemplates, UserInfo userInfo) {
        String beanName = resumeTemplates.name().toLowerCase() + "Template";
        Template template = templates.get(beanName);
        if (template == null) {
            throw new UnsupportedOperationException("Unsupported template");
        }
        return template.combine(userInfo);
    }

}
