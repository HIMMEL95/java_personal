package java_personal.LeetCode.Algorithms;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int solution(String s) {
        Map<String, Integer> hashMap = new HashMap<>();
        String[] symbol = {"I", "V", "X", "L", "C", "D", "M"};
        int[] value = {1, 5, 10, 50, 100, 500, 1000};

        for (int i=0; i< symbol.length; i++) {
            hashMap.put(symbol[i], value[i]);
        }

        int result = 0;
        if (s.contains("IV")) {
            result += 4;
            s = s.replace("IV", "");
        } else if (s.contains("IX")) {
            result += 9;
            s = s.replace("IX", "");
        } else if (s.contains("XL")) {
            result += 40;
            s = s.replace("XL", "");
        } else if (s.contains("XC")) {
            result += 90;
            s = s.replace("XC", "");
        } else if (s.contains("CD")) {
            result += 400;
            s = s.replace("CD", "");
        } else if (s.contains("CM")) {
            result += 900;
            s = s.replace("CM", "");
            System.out.println(s);
        }

        for (int i=0; i<s.length(); i++) {
            if (hashMap.containsKey(Character.toString(s.charAt(i)))) {
                result += hashMap.get(Character.toString(s.charAt(i)));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "III";
        System.out.println(solution(s));
        s = "LVIII";
        System.out.println(solution(s));
        s = "MCMXCIV";
        System.out.println(solution(s));
    }
}
