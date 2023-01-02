import java.io.*;
import java.util.*;

public class TextEditor {

    public static String deleteDuplicateWords(String content) {

        String[] split = content.split(" ");
        Set<String> hashSet = new LinkedHashSet<String>();
        String resultFullname = "";

        for (String splitted : split) {
            hashSet.add(splitted);
        }

        Iterator itr = hashSet.iterator();

        while (itr.hasNext()) {
            resultFullname += itr.next() + " ";
        }

        return resultFullname.trim();
    }

    public static String removeExtraSpace(String content) throws IOException {
        content = content.trim();
        ArrayList<String> splited = new ArrayList<>(Arrays.asList(content.split("")));
        for (int i = 0; i < splited.size() - 1; i++) {
            if (splited.get(i).equals(" ") && splited.get(i + 1).equals(" ")) {
                splited.remove(i);
                i--;
            }
        }
        String word = "";
        for (String each : splited)
            word += each;
        return word;
    }


    public static String toLowerCase(String content) {

        String resultFullname = "";

        String[] splitted = content.split(" ");
        for (int i = 0; i < splitted.length; i++) {
            if (!splitted[i].isEmpty()) {
                resultFullname += splitted[i].substring(0).toLowerCase() + " ";
            }
        }
        return resultFullname.trim();
    }

    public static String capitalizeSentence(String content) {
        StringBuilder result = new StringBuilder();
        boolean capitalize = true; //state
        for (char c : content.toCharArray()) {
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

    public static String editText(String content) throws IOException {
        return capitalizeSentence(toLowerCase(removeExtraSpace(deleteDuplicateWords(content))));
    }
}
