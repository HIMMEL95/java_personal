package java_personal.LeetCode.Algorithms;

class SumOfAllOddLengthSubarrays {

    public static int sumOddLengthSubarrays(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {1, 4, 2, 5, 3};

        System.out.println(sumOddLengthSubarrays(arr));

    }
}
   
