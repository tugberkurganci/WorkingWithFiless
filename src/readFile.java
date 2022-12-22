import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class readFile {

    public static void dosyaOku() {
        String filePath = "C:\\USERS\\tugberk\\Desktop\\tugberk.txt";

        String contents = null;
        try {
            contents = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}