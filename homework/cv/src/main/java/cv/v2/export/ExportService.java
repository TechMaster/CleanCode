package cv.v2.export;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ExportService {

    private final Map<String, ExportStrategy> exportStrategies;

    /**
     * Export HTML string to requested format
     * @return output as File object
     */
    public File export(String templateHTML, ResumeFormats resumeFormats) {
        ExportStrategy exportStrategy = lookUpStrategy(resumeFormats);
        return exportStrategy.export(templateHTML);
    }

    private ExportStrategy lookUpStrategy(ResumeFormats resumeFormats) {
        String beanName = resumeFormats.name().toLowerCase() + "Strategy";
        ExportStrategy exportStrategy = exportStrategies.get(beanName);
        if (exportStrategy == null) {
            throw new UnsupportedOperationException("Unsupported format");
        }
        return exportStrategy;
    }

}
