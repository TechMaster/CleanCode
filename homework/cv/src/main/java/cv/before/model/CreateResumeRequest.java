package cv.before.model;

import cv.before.export.ResumeFormats;
import cv.before.template.ResumeTemplates;
import lombok.Data;

@Data
public class CreateResumeRequest {

    private UserInfo userInfo;

    private ResumeTemplates resumeTemplates;

    private ResumeFormats resumeFormats;

}
