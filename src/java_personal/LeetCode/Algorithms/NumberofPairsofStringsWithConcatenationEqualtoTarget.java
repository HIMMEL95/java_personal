package java_personal.LeetCode.Algorithms;

import java.util.ArrayList;
import java.util.List;

public class NumberofPairsofStringsWithConcatenationEqualtoTarget {

    public static int numOfPairs(String[] nums, String target) {

        List<String> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                list.add(nums[i] + nums[j]);
                list.add(nums[j] + nums[i]);
            }
        }

        int count = 0;
        for (String str : list) {
            if (str.equals(target)) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        String[] nums = {"777", "7", "77", "77"};
        String target = "7777";
        System.out.println(numOfPairs(nums, target));
    }
}
