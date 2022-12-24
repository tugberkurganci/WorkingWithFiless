import java.io.*;
import java.util.*;

public class  Business{

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

    public static String removeExtraSpace(String input) throws IOException {
        input= input.trim();
        ArrayList<String> x= new ArrayList<>(Arrays.asList(input.split("")));
        for(int i=0; i<x.size()-1;i++) {
            if(x.get(i).equals(" ") && x.get(i+1).equals(" ")) {
                x.remove(i);
                i--;
            }
        }
        String word="";
        for(String each: x)
            word+=each;
        return word;
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
    public static String functionMix(String contents) throws IOException {
        return Business.capitalizeSentence(Business.generateFullName(Business.removeExtraSpace(Business.duplicateWords(contents))));


    }
}
