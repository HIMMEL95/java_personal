package java_personal.LeetCode.Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindCommonCharacters {

    public static List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();

        String str = "";
        for (int i=1; i<words.length; i++) {
            for (int j=0; j<words[i].length(); j++) {
                String word = words[i-1];
                char c = words[i].charAt(j);
                System.out.println(str);
                if (i == 1){
                    if (word.contains(String.valueOf(c))) {
                        str += c;
                    }
                } else {
                    if (str.contains(String.valueOf(c))) {
                        System.out.println("test : "+ String.valueOf(c));
                        result.add(String.valueOf(c));
                        str = str.replaceFirst(String.valueOf(c), "");
                    }
                }
            }
        }

        Collections.sort(result);

        return result;
    }

    public static void main(String[] args) {
        String[] words = {"bella", "label", "roller"};
        System.out.println(commonChars(words));

        String[] word1 = {"cool", "lock", "cook"};
        System.out.println(commonChars(word1));

        String[] word2 = {"acabcddd","bcbdbcbd","baddbadb","cbdddcac","aacbcccd","ccccddda","cababaab","addcaccd"};
        System.out.println(commonChars(word2));
    }
}
