package java_personal.LeetCode.Algorithms;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {
    public static String Solution(String[] strs) {
        String str = "";
        String result = "";

        if(strs.length == 1) {
            result = strs[0];
        }

        for (int i=1; i< strs.length; i++) {
            for (int j=0; j<strs[i].length(); j++) {
                if(strs[i-1].contains(Character.toString(strs[i].charAt(j)))) {
                    result = "";
                    result += strs[i].charAt(j);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        System.out.println(Solution(arr));
        String[] arr1 = {"dog", "racecar", "car"};
        System.out.println(Solution(arr1));
        String[] arr2 = {"a"};
        System.out.println(Solution(arr2));
        String[] arr3 = {"ab", "a"};
        System.out.println(Solution(arr3));
    }
}
