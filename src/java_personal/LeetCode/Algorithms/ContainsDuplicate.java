package java_personal.LeetCode.Algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

//        List<Integer> num = new ArrayList<>();
        Set<Integer> num = new HashSet<>();

        for (int i=0; i<nums.length; i++) {
            if (num.contains(nums[i])) {
              return true;
            } else {
                num.add(nums[i]);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        System.out.println(containsDuplicate(nums));
    }
}
