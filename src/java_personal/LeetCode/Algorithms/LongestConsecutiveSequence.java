package java_personal.LeetCode.Algorithms;

import java.util.*;

public class LongestConsecutiveSequence {

//    public static int longestConsecutive(int[] nums) {
//        List<Integer> resultList = new ArrayList<>();
//        int max = 0;
//        int result = 0;
//
//        Arrays.sort(nums);
//        Set<Integer> set = new HashSet<>();
//        for(int num : nums) {
//            set.add(num);
//        }
//
//        ArrayList<Integer> setArr = new ArrayList<>(set);
//        Collections.sort(setArr);
//
//        List<Integer> maxList = new ArrayList<>();
//
//        if (setArr.size() == 1) result = set.size();
//        else {
//            for (int a : setArr) {
//                if (resultList.size() == 0) {
//                    resultList.add(a);
//                    max = resultList.size();
//                } else {
//                    if(a == (resultList.get(resultList.size()-1)+1)) {
//                        resultList.add(a);
//                        max = resultList.size();
//                    }
//                    else {
//                        maxList.add(max);
//                        resultList.clear();
//                        resultList.add(a);
//                    }
//                }
//            }
//        }
//
//        if (maxList.size() == 0) result = max;
//        else result = maxList.get(maxList.size()-1);
//        return result;
//    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        int answer = 0;

        Arrays.sort(nums);

        Set<Integer> set = new HashSet<>();
        List<Integer> uniqueNums = new ArrayList<>();

        for (int num: nums) {
            if (!set.contains(num)) {
                set.add(num);
                uniqueNums.add(num);
            }
        }

        int length = 0;
        for (int i=1; i<uniqueNums.size(); i++) {
            if (uniqueNums.get(i) - uniqueNums.get(i - 1) == 1) length++;
            else {
                answer = Math.max(answer, length+1);
                length = 0;
            }
        }

        answer = Math.max(answer, length + 1);
        return answer;
    }

    public static void main(String[] args) {
         int[] nums1 = {};
        System.out.println(longestConsecutive(nums1));
    }
}
