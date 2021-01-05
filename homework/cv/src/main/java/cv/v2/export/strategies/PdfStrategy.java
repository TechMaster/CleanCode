package cv.v2.export.strategies;

import cv.v2.export.ExportStrategy;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class PdfStrategy implements ExportStrategy {

    @Override
    public File export(String templateHTML) {
        // Using external libraries to create PDF file
        return new File("/path/to/output");
    }

}
