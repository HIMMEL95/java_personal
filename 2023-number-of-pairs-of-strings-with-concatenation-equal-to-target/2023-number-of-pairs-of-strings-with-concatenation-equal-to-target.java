class Solution {
    public int numOfPairs(String[] nums, String target) {
        List<String> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                list.add(nums[i] + nums[j]);
                list.add(nums[j] + nums[i]);
            }
        }

        int count = 0;
        for (String str : list) {
            if (str.equals(target)) count++;
        }

        return count;
    }
}