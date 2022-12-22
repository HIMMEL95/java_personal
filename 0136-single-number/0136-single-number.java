class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        
        int result = 0;
        for (Integer a : hm.keySet()) {
            if (hm.get(a) == 1) {
                result = a;
            }
        }

        return result;
    }
}