package java_personal.LeetCode.Algorithms;

import java.util.Arrays;

public class SortingTheSentence {
    public static String sortSentence(String s) {

        String[] str = s.split(" ");
        String result = "";

        for (int i=0; i<str.length; i++) {
            for (int j=0; j<str.length; j++) {
                if (i < str.length-1) {
                    if (String.valueOf(str[j].charAt(str[j].length()-1)).equals(String.valueOf(i+1))) {
                        result += str[j].substring(0, str[j].length() - 1);
                        result += " ";
                    }
                } else {
                    if (String.valueOf(str[j].charAt(str[j].length()-1)).equals(String.valueOf(i+1))) {
                        result += str[j].substring(0,str[j].length()-1);
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
}
