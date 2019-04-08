package rocks.zipcode.io.quiz4.fundamentals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> list = new HashSet<>();

        for (int i = 0; i < string.length(); i++){
            for (int j = i + 1; j <= string.length(); j++){
                String sub = string.substring(i, j);
                list.add(sub);
            }
        }
        String[] all = new String[list.size()];
        return list.toArray(all);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        Set<String> substrings1 = new HashSet<>(Arrays.asList(getAllSubstrings(string1)));
        Set<String> substrings2 = new HashSet<>(Arrays.asList(getAllSubstrings(string2)));
        Set<String> commonSubstrings = new HashSet<>();
        for (String s : substrings1){
            if (substrings1.contains(s) && substrings2.contains(s)){
                commonSubstrings.add(s);
            }
        }
        String[] commonSubstringsArr = new String[commonSubstrings.size()];
        Integer count = 0;
        for (String s : commonSubstrings){
            commonSubstringsArr[count] = s;
            count++;
        }
        return commonSubstringsArr;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] commonSubstrings = getCommonSubstrings(string1, string2);
        String largestCommonSubstring = commonSubstrings[0];
        for (int i = 0; i < commonSubstrings.length; i++){
            for (String commonSubstring : commonSubstrings) {
                if (commonSubstring.length() > largestCommonSubstring.length()) {
                    largestCommonSubstring = commonSubstring;
                }
            }
        }
        return largestCommonSubstring;
    }
}
