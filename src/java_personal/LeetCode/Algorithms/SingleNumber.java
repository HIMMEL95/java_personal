package java_personal.LeetCode.Algorithms;

import java.util.HashMap;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        int result = 0;
        for (Integer a : hm.keySet()) {
            if (hm.get(a) == 1) {
                result = a;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        System.out.println(singleNumber(nums));
        int[] nums1 = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums1));
    }
}
