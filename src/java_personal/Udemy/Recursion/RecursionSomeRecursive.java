package java_personal.Udemy.Recursion;

import java.util.Arrays;

class RecursionSomeRecursive {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        OddFunction isOdd = new OddFunction();
        RecursionSomeRecursive rsr = new RecursionSomeRecursive();
        boolean result = rsr.someRecursive(arr, isOdd);
        System.out.println(result);
        
        int[] arr1 = {4, 6, 8};
        boolean result1 = rsr.someRecursive(arr1, isOdd);
        System.out.println(result1);

    }

    public boolean someRecursive(int[] arr, OddFunction odd) {

        if (arr.length == 0)
            return false;
        else if (odd.run(arr[0]) == false)
            return someRecursive(Arrays.copyOfRange(arr, 1, arr.length), odd);
        else
            return true;
    }
}

