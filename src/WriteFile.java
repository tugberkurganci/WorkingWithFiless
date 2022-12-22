import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void dosyaYazz(String a) {

        File f =new File("C:\\USERS\\tugberk\\Desktop\\tugberk.txt");

        try {

            FileWriter fileWriter=new FileWriter(f);
            fileWriter.write(a);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
