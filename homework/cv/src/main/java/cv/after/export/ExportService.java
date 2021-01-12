package cv.after.export;

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
        ExportStrategy exportStrategy = lookupStrategy(resumeFormats);
        return exportStrategy.export(templateHTML);
    }

    private ExportStrategy lookupStrategy(ResumeFormats resumeFormats) {
        String beanName = resumeFormats.name().toLowerCase() + "Strategy";
        ExportStrategy exportStrategy = exportStrategies.get(beanName);
        if (exportStrategy == null) {
            throw new UnsupportedOperationException("Unsupported format");
        }
        return exportStrategy;
    }

}
