package com.leetcode.problems.algorithms.hard;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Given a list of words (without duplicates), please write a program that returns all concatenated words in the given list of words.
 * A concatenated word is defined as a string that is comprised entirely of at least two shorter words in the given array.
 *
 * Example:
 * Input: ["cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"]
 *
 * Output: ["catsdogcats","dogcatsdog","ratcatdogcat"]
 *
 * Explanation: "catsdogcats" can be concatenated by "cats", "dog" and "cats";
 *  "dogcatsdog" can be concatenated by "dog", "cats" and "dog";
 * "ratcatdogcat" can be concatenated by "rat", "cat", "dog" and "cat".
 * Note:
 * The number of elements of the given array will not exceed 10,000
 * The length sum of elements in the given array will not exceed 600,000.
 * All the input string will only include lower case letters.
 * The returned elements order does not matter.
 */
public class ConcatenatedWords {

    public List<String> findAllConcatenatedWordsInADict(String[] words) {

        Set<String> dictionary = Arrays.stream(words).collect(Collectors.toSet());
        List<String> result = new ArrayList<>();
        for (String word : words) {
            dictionary.remove(word);
            if (isConcat(dictionary, word)) result.add(word);
            dictionary.add(word);
        }
        return result;
    }

    public boolean isConcat(Set<String> dictionary, String word) {
        if (dictionary.contains(word)) return true;
        int n = word.length();
        for (int i = 0; i < n; i++) {
            String prefix = word.substring(0, i + 1);
            if (dictionary.contains(prefix)) {
                String suffix = word.substring(i + 1);
                boolean res = isConcat(dictionary, suffix);
                if (res) {
                    dictionary.add(word);
                    return true;
                }
            }
        }
        return false;
    }
}
