package cv.after.model;

import cv.after.export.FormatType;
import cv.after.template.TemplateType;
import lombok.Data;

@Data
public class CreateResumeRequest {

    private UserInfo userInfo;

    private TemplateType templateType;

    private FormatType formatType;

}
