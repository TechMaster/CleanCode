package cv.before;

import cv.before.export.ResumeFormat;
import cv.before.model.CreateResumeRequest;
import cv.before.model.UserInfo;
import cv.before.template.BlueTemplate;
import cv.before.template.GreenTemplate;
import cv.before.template.RedTemplate;
import cv.before.template.TemplateType;

import java.io.File;

public class ResumeService {

    /**
     * Main method to create resume
     */
    public void createResume(CreateResumeRequest request) {
        System.out.printf("Request: %s%n", request);

        String templateHTML = combine(request.getTemplateType(), request.getUserInfo());
        System.out.println("Combine template with user info done");

        File output = export(templateHTML, request.getResumeFormat());
        System.out.println("Export output done");

        download(output);
        System.out.println("Download done");
    }

    /**
     * Combine template with user info from request
     *
     * @return template as HTML string
     */
    private String combine(TemplateType templateType, UserInfo userInfo) {
        if (templateType == TemplateType.BLUE) {
            BlueTemplate blueTemplate = new BlueTemplate();
            return blueTemplate.combine(userInfo);
        } else if (templateType == TemplateType.GREEN) {
            GreenTemplate greenTemplate = new GreenTemplate();
            return greenTemplate.combine(userInfo);
        } else if (templateType == TemplateType.RED) {
            RedTemplate redTemplate = new RedTemplate();
            return redTemplate.combine(userInfo);
        } else {
            throw new UnsupportedOperationException("Unsupported template");
        }
    }

    /**
     * Export HTML string to requested format
     *
     * @return output as File object
     */
    private File export(String templateHTML, ResumeFormat resumeFormat) {
        if (resumeFormat == ResumeFormat.PDF) {
            // Using external libraries to create PDF file
            return new File("/path/to/output");
        } else if (resumeFormat == ResumeFormat.WORD) {
            // Using external libraries to create Word file
            return new File("/path/to/output");
        } else {
            throw new UnsupportedOperationException("Unsupported format");
        }
    }

    /**
     * Download output
     */
    private void download(File output) {
        System.out.println("Preparing downloading output...");
    }

}
