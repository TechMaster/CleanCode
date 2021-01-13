package cv.after.template;

import cv.after.model.UserInfo;
import org.springframework.stereotype.Service;

@Service
public class TemplateService {

    private final TemplateFactory templateFactory = new TemplateFactory();

    /**
     * Combine template with user info from request
     *
     * @return template as HTML string
     */
    public String combine(TemplateType templateType, UserInfo userInfo) {
        Template template = templateFactory.getTemplate(templateType);
        return template.combine(userInfo);
    }

}
