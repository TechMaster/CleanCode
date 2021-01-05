package cv.v2;

import cv.v2.download.DownloadService;
import cv.v2.export.ExportService;
import cv.v2.export.ExportStrategy;
import cv.v2.model.CreateResumeRequest;
import cv.v2.template.TemplateService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Map;

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

        String templateHTML = templateService.combine(request.getResumeTemplates(), request.getUserInfo());
        System.out.println("Combine template with user info done");

        File output = exportService.export(templateHTML, request.getResumeFormats());
        System.out.println("Export output done");

        downloadService.download(output);
        System.out.println("Download done");
    }

}
