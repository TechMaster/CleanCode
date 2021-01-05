package cv.v1;

import cv.v1.export.ResumeFormats;
import cv.v1.model.CreateResumeRequest;
import cv.v1.model.UserInfo;
import cv.v1.template.BlueTemplate;
import cv.v1.template.GreenTemplate;
import cv.v1.template.RedTemplate;
import cv.v1.template.ResumeTemplates;

import java.io.File;

public class ResumeService {

    /**
     * Main method to create resume
     */
    public void createResume(CreateResumeRequest request) {
        System.out.printf("Request: %s%n", request);

        String templateHTML = combine(request.getResumeTemplates(), request.getUserInfo());
        System.out.println("Combine template with user info done");

        File output = export(templateHTML, request.getResumeFormats());
        System.out.println("Export output done");

        download(output);
        System.out.println("Download done");
    }

    /**
     * Combine template with user info from request
     * @return template as HTML string
     */
    private String combine(ResumeTemplates resumeTemplates, UserInfo userInfo) {
        if (resumeTemplates == ResumeTemplates.BLUE) {
            BlueTemplate blueTemplate = new BlueTemplate();
            return blueTemplate.combine(userInfo);
        } else if (resumeTemplates == ResumeTemplates.GREEN) {
            GreenTemplate greenTemplate = new GreenTemplate();
            return greenTemplate.combine(userInfo);
        } else if (resumeTemplates == ResumeTemplates.RED) {
            RedTemplate redTemplate = new RedTemplate();
            return redTemplate.combine(userInfo);
        } else {
            throw new UnsupportedOperationException("Unsupported template");
        }
    }

    /**
     * Export HTML string to requested format
     * @return output as File object
     */
    private File export(String templateHTML, ResumeFormats resumeFormats) {
        if (resumeFormats == ResumeFormats.PDF) {
            // Using external libraries to create PDF file
            return new File("/path/to/output");
        } else if (resumeFormats == ResumeFormats.WORD) {
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
