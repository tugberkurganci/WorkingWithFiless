import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {

    public static String readFile() throws IOException {
        return new String(Files.readAllBytes(Paths.get(Constants.FILE_PATH)));
    }
}