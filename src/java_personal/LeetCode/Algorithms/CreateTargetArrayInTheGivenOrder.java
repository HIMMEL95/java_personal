package java_personal.LeetCode.Algorithms;

import java.util.Arrays;
import java.util.ArrayList;

class CreateTargetArrayInTheGivenOrder {

    public static int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        int[] total = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result.add(index[i], nums[i]);
        }

        for (int j = 0; j < nums.length; j++) {
            total[j] = result.get(j);
        }

        return total;
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
}

