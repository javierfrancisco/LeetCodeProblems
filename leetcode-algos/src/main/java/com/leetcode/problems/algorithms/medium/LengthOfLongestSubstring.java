package com.leetcode.problems.algorithms.medium;


import java.util.HashSet;
import java.util.Set;

/**
 *
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * Example 4:
 *
 * Input: s = ""
 * Output: 0
 *
 *
 * Constraints:
 *
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */
public class LengthOfLongestSubstring {


    /**
     * Get the longest substring without repeating characters using the window approach.
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int i = 0;
        int j = 0;
        int answer = 0;
        Set<Character> set = new HashSet<>();
        while (j < n) {
            if (!set.contains(s.charAt(j))) {
                //move window to right
                set.add(s.charAt(j++));
                answer = Math.max(answer, j-i);
            } else {
                //move window from left
                set.remove(s.charAt(i++));
            }
        }

        return answer;
    }


}
