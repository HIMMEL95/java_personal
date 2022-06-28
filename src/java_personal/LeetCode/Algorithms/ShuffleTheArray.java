package java_personal.LeetCode.Algorithms;

import java.util.Arrays;

class ShuffleTheArray {

    public static int[] shuffle(int[] nums, int n) {

        int len = nums.length;
        int[] result = new int[len];
        
        for (int i = 0; i < n; i++) {
            result[i*2] = nums[i];
            result[i*2+1] = nums[i+n];
            System.out.println("result[i] = " + result[i]);
            System.out.println("result[i+1] = " + result[i+1]);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {2, 5, 1, 3, 4, 7};

        int n = 3;

        System.out.println(Arrays.toString(shuffle(nums, n)));

    }
}

