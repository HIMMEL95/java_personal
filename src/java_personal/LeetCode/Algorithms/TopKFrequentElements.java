package java_personal.LeetCode.Algorithms;

import java.util.*;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];

        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int n : nums) {
            hashMap.put(n, hashMap.getOrDefault(n, 0) + 1);
        }

        List<Integer> numbers = new ArrayList<>(hashMap.keySet());
        Collections.sort(numbers, (value1, value2) -> hashMap.get(value2).compareTo(hashMap.get(value1)));
        for (Integer a : numbers) {
            System.out.println("key : " + a + ", value : " + hashMap.get(a));
        }

        for (int i=0; i<k; i++) {
            result[i] = numbers.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] nums1 = {1, 1, 2, 2, 1, 3, 4, 5, 4};
        k = 2;

        System.out.println(Arrays.toString(topKFrequent(nums, k)));
        System.out.println(Arrays.toString(topKFrequent(nums1, k)));
    }
}
