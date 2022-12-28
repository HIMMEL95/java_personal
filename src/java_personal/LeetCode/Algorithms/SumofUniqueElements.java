package java_personal.LeetCode.Algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumofUniqueElements {

    public static int sumOfUnique(int[] nums) {

        int result = 0;

        Map<Integer, Integer> hm = new HashMap<>();
        for (Integer num: nums) {
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }

        for (Integer key : hm.keySet()) {
            if (hm.get(key) == 1) result += key;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        System.out.println(sumOfUnique(nums));
        int[] test = {1,1,1,1,1};
        System.out.println(sumOfUnique(test));
        int[] num1 = {1,2,3,4,5};
        System.out.println(sumOfUnique(num1));
    }
}
