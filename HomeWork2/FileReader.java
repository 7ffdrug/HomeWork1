package DZ2;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileReader {

    public String readFile(String filePath) throws Exception {
        return Files.readString(Path.of(filePath));
    }
}
