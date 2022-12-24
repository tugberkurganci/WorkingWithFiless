import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        FileInfo rFile=new FileInfo();
        EditText editText =new EditText();
        Business business1 = new Business();

        String contents=new String(Files.readAllBytes(Paths.get("C:\\USERS\\tugberk\\Desktop\\tugberk.txt")));
        rFile.readFile();
        business1.functionMix(contents);
        editText.editInput(business1.functionMix(contents));
        rFile.readFile();

    }
}



