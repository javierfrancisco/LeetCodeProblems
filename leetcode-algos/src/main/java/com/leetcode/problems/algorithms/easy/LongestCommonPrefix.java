package com.leetcode.problems.algorithms.easy;


import java.util.Arrays;
import java.util.Comparator;

/**
 * Longest Common Prefix
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 *
 * Constraints:
 *
 * 0 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lower-case English letters.
 *
 */
public class LongestCommonPrefix {


    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) return "";

        if (strs.length == 1) return strs[0];

        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        String longestPossiblePrefix = strs[0];
        int prefixPointer = 0;
        boolean longestPrefixFound = false;
        int n = strs.length;

        for (int i = 0; i < longestPossiblePrefix.length() && !longestPrefixFound ; i++) {

            char currentLetter = longestPossiblePrefix.charAt(i);

            for (int j = 1; j < n; j++) {

                char other =  strs[j].charAt(i);
                if (currentLetter != other) {
                    longestPrefixFound = true;
                    break;
                }
            }
            if (!longestPrefixFound) {
                prefixPointer++;
            }
        }
        return longestPossiblePrefix.substring(0, prefixPointer);
    }


    public String longestCommonPrefixNew(String[] strs) {

        //Idea, iterate all items in array and get the lowest length,
        // this can be our longest common prefix length
        // then iterate from 0 to  the lowest length
        // iterate all strings array
        // get position in i, and compare to same i location with all strings
        int n = strs[0].length();
        String res = "";
        int i = 0;
        while (i < n) {
            char current = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i > strs[j].length() -1) {
                    return res;
                }
                char nextChar = strs[j].charAt(i);
                if (current != nextChar) {
                    return res; 
                }
            }
            res += current;
            i++;
        }
        return res;
    }
}
