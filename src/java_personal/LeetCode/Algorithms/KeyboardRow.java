package java_personal.LeetCode.Algorithms;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {

    public static String[] row = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};

    public static String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();
        String[] test = new String[words.length];

        for (int i=0; i<row.length; i++) {
            for (int j=0; j< words.length; j++) {
                if (row[i].contains(words[j])) {
                    System.out.println("asas");
                }
            }
        }
        return test;
    }

    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(findWords(words));
    }
}
