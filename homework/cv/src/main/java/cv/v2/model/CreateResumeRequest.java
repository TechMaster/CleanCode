package cv.v2.model;

import cv.v2.export.ResumeFormats;
import cv.v2.template.ResumeTemplates;
import lombok.Data;

@Data
public class CreateResumeRequest {

    private UserInfo userInfo;

    private ResumeTemplates resumeTemplates;

    private ResumeFormats resumeFormats;

}
