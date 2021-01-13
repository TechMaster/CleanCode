package cv.before.model;

import cv.before.export.FormatType;
import cv.before.template.TemplateType;
import lombok.Data;

@Data
public class CreateResumeRequest {

    private UserInfo userInfo;

    private TemplateType templateType;

    private FormatType formatType;

}
