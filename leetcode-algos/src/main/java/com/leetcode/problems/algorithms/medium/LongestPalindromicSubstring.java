package com.leetcode.problems.algorithms.medium;

/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 *
 * Example 1:
 *
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: "cbbd"
 * Output: "bb"
 */
public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {

        int n = s.length();
        int leftPointer = 0;
        int rightPointer = n - 1;
        String result = "";
        StringBuilder tempResult = new StringBuilder();
        int tempRightPointer = rightPointer;
        int tempLeftPointer = leftPointer;
        String tempRes = "";
        while (tempLeftPointer < tempRightPointer) {

            if (s.charAt(tempLeftPointer) == s.charAt(tempRightPointer)) {
                tempResult.append(Character.toString(s.charAt(tempLeftPointer)));
                tempLeftPointer++;
                tempRightPointer--;
            } else {
                tempRightPointer = --rightPointer;
                tempLeftPointer = ++leftPointer;
                tempResult = new StringBuilder();
            }
        }
        if (tempLeftPointer == tempRightPointer) {
            tempRes = tempResult.toString() + Character.toString(s.charAt(tempLeftPointer)) + tempResult.reverse().toString();
        } else {
            tempRes = tempResult.toString() + tempResult.reverse().toString();
        }

        if (!("").equals(tempRes) && tempRes.length() > result.length()) {
            result = tempRes;
        }

        return result;
    }

}
