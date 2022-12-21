package java_personal.LeetCode.Algorithms;

import java.util.*;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        List<Character> sList = new ArrayList<>();
        List<Character> tList = new ArrayList<>();

        int sLen = s.length();
        int tLen = t.length();

        if (sLen != tLen) {
            return false;
        } else {
            for (int i=0; i<s.length(); i++) {
                sList.add(s.charAt(i));
                tList.add(t.charAt(i));
            }
            Collections.sort(sList);
            Collections.sort(tList);

            for (int i=0; i<tList.size(); i++) {
                if (sList.get(i) != tList.get(i)) return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));

        s = "rat";
        t = "cat";
        System.out.println(isAnagram(s,t));

        s = "a";
        t = "ab";
        System.out.println(isAnagram(s,t));
    }
}
