package java_personal.LeetCode.Algorithms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProductOfArrayExceptSelf {

//    public static int multiply(int[] nums) {
//        int multi = 1;
//
//        for (int num : nums) {
//            multi *= num;
//        }
//        return multi;
//    }
//
//    public static int[] productExceptSelf(int[] nums) {
//        int[] temp = new int[nums.length];
//
//        List<Integer> tempArr = new ArrayList<>();
//
//        for (int i=0; i<nums.length; i++) {
//            tempArr.add(nums[i]);
//        }
//
//        for (int i=0; i<nums.length; i++) {
//            List<Integer> copyArr = new ArrayList<>();
//            copyArr.addAll(tempArr);
//            copyArr.remove(i);
//            int[] numsArr = copyArr.toArray();
//            multiply(copyArr);
//            System.out.println(copyArr);
//        }
//
//        System.out.println(tempArr);
//        return temp;
//    }

    public static int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        left[0] = 1;
        for (int i=1; i< nums.length; i++) {
            left[i] = left[i-1] * nums[i-1];
        }

        int[] right = new int[nums.length];
        right[nums.length-1] = 1;
        for(int i=nums.length -2; i>=0; i--) {
            right[i] = right[i+1] * nums[i+1];
        }

        int[] answer = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            answer[i] = left[i] * right[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
