package java_personal.LeetCode.Algorithms;

class CountNumberOfPairsWithAbsoluteDifferenceK {

    public static int countKDifference(int[] nums, int k) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] - nums[j] == k || nums[i] - nums[j] == (-1*k)) {
                    count += 1;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 1};
        int k = 1;
        System.out.println(countKDifference(nums, k));

        int[] a = {1, 3};
        int a1 = 0;
        System.out.println(countKDifference(a, a1));

        int[] b = {3, 2, 1, 5, 4};
        int b1 = 2;
        System.out.println(countKDifference(b, b1));

    }
}

