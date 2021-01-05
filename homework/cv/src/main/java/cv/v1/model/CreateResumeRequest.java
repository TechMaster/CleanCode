package cv.v1.model;

import cv.v1.export.ResumeFormats;
import cv.v1.template.ResumeTemplates;
import lombok.Data;

@Data
public class CreateResumeRequest {

    private UserInfo userInfo;

    private ResumeTemplates resumeTemplates;

    private ResumeFormats resumeFormats;

}
