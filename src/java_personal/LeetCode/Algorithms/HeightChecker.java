package java_personal.LeetCode.Algorithms;

import java.util.Arrays;

public class HeightChecker {

    public static int heightChecker(int[] heights) {
        int result = 0;
        int[] copyArr = Arrays.copyOf(heights, heights.length);

        int temp = 0;
        for (int i=0; i<heights.length; i++) {
            for (int j=i+1; j<heights.length; j++) {
                if (copyArr[i] > copyArr[j]) {
                    temp = copyArr[i];
                    copyArr[i] = copyArr[j];
                    copyArr[j] = temp;
                }
            }
        }

        for (int i=0; i<heights.length; i++) {
            if (heights[i] != copyArr[i]) result++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker(heights));

        int[] test = {5,1,2,3,4};
        System.out.println(heightChecker(test));
    }
}
