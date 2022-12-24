import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EditText {
    public static void editInput(String a) {

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
