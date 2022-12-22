import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        readFile rFile=new readFile();
        WriteFile writeFile =new WriteFile();
        business wFile = new business();

        String contents=new String(Files.readAllBytes(Paths.get("C:\\USERS\\tugberk\\Desktop\\tugberk.txt")));

        String a = business.capitalizeSentence(business.generateFullName(business.boşlukReis(business.duplicateWords(contents))));
        System.out.println(contents);
        WriteFile.dosyaYazz(a);
        System.out.println(a);

    }
}



