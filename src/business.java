import java.io.*;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class business{

    public static String duplicateWords(String contents) throws IOException {


        String[] myList=contents.split(" ");
        Set<String> mySet=new LinkedHashSet<String>();
        String resultFullname="";
        for(String a:myList){
            mySet.add(a);
        }
        Iterator itr = mySet.iterator();
        while (itr.hasNext()){
            resultFullname +=itr.next()+" ";
    }
        return resultFullname.trim();
    }

    public static String boşlukReis(String contents) throws IOException {
        return contents.replaceAll("( )+", " ");


    }
    public static String generateFullName(String fullname){
        String resultFullname="";

        String[] splitted=fullname.split(" ");
        for(int i=0;i<splitted.length;i++) {
            if (!splitted[i].isEmpty() ) {
                resultFullname += splitted[i].substring(0).toLowerCase()+" ";
            }
        }
        return resultFullname.trim();
    }

    public static String capitalizeSentence(String sentence) {
        StringBuilder result = new StringBuilder();
        boolean capitalize = true; //state
        for(char c : sentence.toCharArray()) {
            if (capitalize) {
                //this is the capitalize state
                result.append(Character.toUpperCase(c));
                if (!Character.isWhitespace(c) && c != '.') {
                    capitalize = false; //change state
                }
            } else {
                //this is the don't capitalize state
                result.append(c);
                if (c == '.') {
                    capitalize = true; //change state
                }
            }
        }
        return result.toString();
    }
}
