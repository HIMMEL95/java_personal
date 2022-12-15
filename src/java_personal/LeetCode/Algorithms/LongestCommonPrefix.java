package java_personal.LeetCode.Algorithms;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {
    public static String Solution(String[] strs) {
        String result = "";

        if(strs.length == 1) {
            result = strs[0];
        } else {
            for (int i=1; i< strs.length; i++) {
                result="";
                if (strs[i].length() == 1) {
                    if (strs[i-1].contains(Character.toString(strs[i].charAt(0)))) {
                        result += strs[i].charAt(0);
                    }
                } else {
                    for (int j=1; j<=strs[i].length()-1; j++) {
                        if(strs[i-1].contains(Character.toString(strs[i].charAt(j-1)))) {
                            if (!strs[i-1].contains(Character.toString(strs[i].charAt(j)))) {
                                result += strs[i-1].charAt(j-1);
                                break;
                            } else {
                                result += strs[i-1].charAt(j-1);
                            }
                        }
                    }
                }
                strs[i] = result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] arr3 = {"cir", "car"};
        System.out.println(Solution(arr3));
        String[] arr = {"flower", "flow", "flight"};
        System.out.println(Solution(arr));
        String[] arr1 = {"ab", "a"};
        System.out.println(Solution(arr1));
    }
}
