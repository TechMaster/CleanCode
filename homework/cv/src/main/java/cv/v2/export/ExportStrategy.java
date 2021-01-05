package cv.v2.export;

import java.io.File;

public interface ExportStrategy {

    File export(String templateHTML);

}
