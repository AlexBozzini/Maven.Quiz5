package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        String[] allSubstrings = StringEvaluator.getAllSubstrings(string);
        Set<String> palindromeSet = new HashSet<>();
        for (String s : allSubstrings){
            if (isPalindrome(s)){
                palindromeSet.add(s);
            }
        }
        String[] palindromeArr = new String[palindromeSet.size()];
        Integer count = 0;
        for (String s : palindromeSet){
            palindromeArr[count] = s;
            count++;
        }
        return palindromeArr;
    }

    public static Boolean isPalindrome(String string) {
        if (string.equals(reverseString(string))){
            return true;
        }
        return false;
    }

    public static String reverseString(String string) {
        StringBuilder builder = new StringBuilder();
        char[] chars = string.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--){
            builder.append(chars[i]);
        }
        return builder.toString();
    }
}
