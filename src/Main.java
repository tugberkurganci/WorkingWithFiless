import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("File process is starting");

        String content = "";

        FileReader fileReader = new FileReader();
        TextEditor textEditor = new TextEditor();
        TextWriter textWriter = new TextWriter();

        content = fileReader.readFile();
        content = textEditor.editText(content);
        textWriter.writeToFile(content);

        System.out.println("File process ended");
    }
}



