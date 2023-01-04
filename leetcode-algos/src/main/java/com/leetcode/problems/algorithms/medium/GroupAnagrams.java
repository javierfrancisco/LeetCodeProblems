package com.leetcode.problems.algorithms.medium;

import java.util.*;

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * Example 2:
 *
 * Input: strs = [""]
 * Output: [[""]]
 * Example 3:
 *
 * Input: strs = ["a"]
 * Output: [["a"]]
 *
 *
 * Constraints:
 *
 * 1 <= strs.length <= 104
 * 0 <= strs[i].length <= 100
 * strs[i] consists of lowercase English letters.
 */
public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> anagrams = new HashMap<>();

        int n = strs.length;
        for (int i = 0; i < n; i++) {

            char[] strsCharArray = strs[i].toCharArray();
            String rawKey = new String(strsCharArray);
            Arrays.sort(strsCharArray);
            String key = new String(strsCharArray);

            List<String> list = new ArrayList<>();
            if (anagrams.containsKey(key)) {
                list = anagrams.get(key);
            }
            list.add(rawKey);
            anagrams.put(key, list);
        }
        Collection<List<String>> collection = anagrams.values();
        Iterator<List<String>> iterator = collection.iterator();

        while(iterator.hasNext()) {
            result.add((iterator.next()));
        }
        return result;
    }
}
