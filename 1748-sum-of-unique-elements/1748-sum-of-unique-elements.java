class Solution {
    public int sumOfUnique(int[] nums) {
        int result = 0;

        Map<Integer, Integer> hm = new HashMap<>();
        for (Integer num: nums) {
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }

        for (Integer key : hm.keySet()) {
            if (hm.get(key) == 1) result += key;
        }

        return result;
    }
}