class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];

        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int n : nums) {
            hashMap.put(n, hashMap.getOrDefault(n, 0) + 1);
        }

        List<Integer> numbers = new ArrayList<>(hashMap.keySet());
        Collections.sort(numbers, (value1, value2) -> hashMap.get(value2).compareTo(hashMap.get(value1)));

        for (int i=0; i<k; i++) {
            result[i] = numbers.get(i);
        }
        return result;
    }
}