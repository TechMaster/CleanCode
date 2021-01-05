package cv.v2.download;

import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class DownloadService {

    /**
     * Download output
     */
    public void download(File output) {
        System.out.println("Preparing downloading output...");
    }

}
