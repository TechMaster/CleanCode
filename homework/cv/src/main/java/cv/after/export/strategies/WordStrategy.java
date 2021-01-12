package cv.after.export.strategies;

import cv.after.export.ExportStrategy;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class WordStrategy implements ExportStrategy {

    @Override
    public File export(String templateHTML) {
        // Using external libraries to create Word file
        return new File("/path/to/output");
    }

}
