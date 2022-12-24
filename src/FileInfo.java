import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileInfo {

    public static void readFile() throws FileNotFoundException {

        File file = new File("C:\\USERS\\tugberk\\Desktop\\tugberk.txt");
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            System.out.println(line);
        }
        reader.close();
    }
}