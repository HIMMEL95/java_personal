package java_personal.LeetCode.Algorithms;

import java.util.Arrays;

public class MedianofTwoSortedArrays {
    public static double findMedianSortedArrays(int[] num1, int[] num2) {

        int[] total = addArray(num1, num2);
        double result = 0.0;

        sortArray(total);

        if (total.length == 1) {
            result = total[0];
        } else {
            if (total.length % 2 == 1) {
                result = (double)total[total.length/2];
            } else {
                result = ((double) total[(total.length/2)-1] + (double)total[total.length/2]) /2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] num1 = {};
        int[] num2 = {1};
        System.out.println(findMedianSortedArrays(num1, num2));
        int[] num3 = {};
        int[] num4 = {2, 3};
        System.out.println(findMedianSortedArrays(num3, num4));
    }

    public static int[] sortArray(int[] arr) {
        int temp = 0;

        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] addArray(int[] arr1, int[] arr2) {
        int index = 0;
        int[] total = new int[arr1.length + arr2.length];

        for (Integer a : arr1) {
            total[index++] = a;
        }

        for (Integer a : arr2) {
            total[index++] = a;
        }

        return total;
    }
}
