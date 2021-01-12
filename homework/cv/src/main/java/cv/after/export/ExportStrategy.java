package cv.after.export;

import java.io.File;

public interface ExportStrategy {

    File export(String templateHTML);

}
