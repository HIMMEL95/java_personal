package java_personal.LeetCode.Algorithms;

import java.util.*;

public class TopKFrequentWords {

//    public static List<String> topKFrequent(String[] words, int k) {
//
//        List<String> result = new ArrayList<>();
//
//        Map<String, Integer> hm = new HashMap<>();
//
//        for(String word : words) {
//            hm.put(word, hm.getOrDefault(word, 0)+1);
//        }
//
//        List<String> keys = new ArrayList<>(hm.keySet());
//        keys.sort((s1, s2) -> s1.compareTo(s2));
//        System.out.println(keys);
//
//        for (String key :keys) {
//            System.out.println(key);
//        }
//
//        return result;
//    }

    public static class MyComparator implements Comparator<Map.Entry<String, Integer>> {
        @Override
        public int compare(Map.Entry<String, Integer> m1, Map.Entry<String, Integer> m2) {
            if (m2.getValue() > m1.getValue()) return 1;
            else if (m2.getValue() < m1.getValue()) return -1;
            else return m1.getKey().compareToIgnoreCase(m2.getKey());
        }
    }

    public static List<String> topKFrequent(String[] words, int k) {

        Map<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0)+1);
        }

        List<Map.Entry<String, Integer>> freqEntryList = new ArrayList<>(freq.entrySet());
        freqEntryList.sort(new MyComparator());

        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> freqEntry : freqEntryList) {
            result.add(freqEntry.getKey());
            if (result.size() == k) return result;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        System.out.println(topKFrequent(words, k));
    }
}
