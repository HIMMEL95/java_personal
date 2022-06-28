package java_personal.LeetCode.Algorithms;

import java.util.Arrays;

class RunningSumOf1dArray {
    public static int[] runningSum(int[] nums) {
        int sum = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        runningSum(nums);

        System.out.println(Arrays.toString(runningSum(nums)));
    }
}

