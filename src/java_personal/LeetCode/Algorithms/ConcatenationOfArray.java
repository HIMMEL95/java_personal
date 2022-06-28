package java_personal.LeetCode.Algorithms;

import java.util.Arrays;

class ConcatenationOfArray {

    public static int[] getConcatenation(int[] nums) {

        int len = nums.length;
        int[] result = new int[len*2];

        int i;
        for(i = 0; i < len; i++) {
            result[i] = nums[i];
            System.out.println(i);
        }
        for(int j = i; j < len*2; j++) {
            result[j] = nums[j-len];
            System.out.println(j);
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 1};   
        System.out.println(Arrays.toString(getConcatenation(nums)));

        int[] nums1 = {1, 3, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(nums1)));
    }
}
