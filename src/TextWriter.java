import java.io.*;
import java.io.IOException;

public class TextWriter {
    public static void writeToFile(String content) {

        File file =new File(Constants.FILE_PATH);

        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
