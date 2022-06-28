package java_personal.LeetCode.Algorithms;

import java.util.Arrays;
import java.util.ArrayList;

class RearrangeArrayElementsBySign {

    public static int[] rearrangeArray(int[] nums) {

        ArrayList<Integer> plus = new ArrayList<Integer>();
        ArrayList<Integer> minus = new ArrayList<Integer>();
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                plus.add(nums[i]);
            }
            else {
                minus.add(nums[i]);
            }
        }

        for (Integer i : plus)
            System.out.println(i);

        for (Integer j : minus)
            System.out.println(j);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < plus.size(); j++) {
                if (

        System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {

        int[] nums = {3, 1, -2, -5, 2, -4};

        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
}
