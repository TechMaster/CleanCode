package cv.after.model;

import cv.after.export.ResumeFormats;
import cv.after.template.ResumeTemplates;
import lombok.Data;

@Data
public class CreateResumeRequest {

    private UserInfo userInfo;

    private ResumeTemplates resumeTemplates;

    private ResumeFormats resumeFormats;

}
