package java_personal.LeetCode.Algorithms;

import java.util.Arrays;

class BuildArrayFromPermutation {

    public static int[] buildArray(int[] nums) {

        int len = nums.length;
        int[] result = new int[len];

        for (int i = 0; i< nums.length; i++)
            result[i] = nums[nums[i]];

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(buildArray(nums)));

        int[] nums1 = {5, 0, 1, 2, 3, 4};
        System.out.println(Arrays.toString(buildArray(nums1)));

    }
}
