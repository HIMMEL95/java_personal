package java_personal.LeetCode.Algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaximumSubArray {

//    public static int maxSubArray(int[] nums) {
//        int len = nums.length;
//
//        int max = 0;
//        for (int i=0; i<len; i++) {
//            int[] copyArr = Arrays.copyOf(nums, len);
//            for (int j=1; j<len; j++) {
//                int[] subArr = Arrays.copyOfRange(copyArr, j-1, j);
//                int sum = Arrays.stream(subArr).sum();
//                if (sum > max) {
//                    max = sum;
//                }
//            }
//        }
//
//        return max;
//    }

    public static int maxSubArray(int[] nums) {

        int answer = nums[0];

//        풀이 1 (Time Limit Exceeded)
//        for (int i=0; i< nums.length; i++) {
//            for (int j=i; j< nums.length; j++) {
//                int curSum = 0;
//                for (int k=i; k<=j; k++) {
//                    curSum += nums[k];
//                }
//                answer = Math.max(answer, curSum);
//            }
//        }

//        풀이 2 (Time Limit Exceeded)
//        for (int i=0; i<nums.length; i++) {
//            int curSum = 0;
//            for (int j=i; j<nums.length; j++) {
//                curSum += nums[j];
//                answer = Math.max(curSum, answer);
//            }
//        }

//            풀이 3
        int curSum = 0;

        for (int num : nums) {
            if (curSum < 0) curSum = 0;

            curSum+= num;
            answer = Math.max(answer, curSum);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }
}
