package cv.after;

import cv.after.download.DownloadService;
import cv.after.export.ExportService;
import cv.after.model.CreateResumeRequest;
import cv.after.template.TemplateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.File;

@RequiredArgsConstructor
@Service
public class ResumeService {

    private final ExportService exportService;
    private final TemplateService templateService;
    private final DownloadService downloadService;

    /**
     * Main method to create resume
     */
    public void createResume(CreateResumeRequest request) {
        System.out.printf("Request: %s%n", request);

        String templateHTML = templateService.combine(request.getTemplateType(), request.getUserInfo());
        System.out.println("Combine template with user info done");

        File output = exportService.export(templateHTML, request.getFormatType());
        System.out.println("Export output done");

        downloadService.download(output);
        System.out.println("Download done");
    }

}
