package com.leetcode.problems.algorithms.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for LongestPalindromicSubstring.
 */
public class LengthOfLongestSubstringTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testLongestPalindromicSubstring() {
        String input = "abcabcbb";
        int expectedOutput = 3;
        int result = LengthOfLongestSubstring.lengthOfLongestSubstring(input);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void testLongestPalindromicSubstring_bbbbb() {
        String input = "bbbbb";
        int expectedOutput = 1;
        int result = LengthOfLongestSubstring.lengthOfLongestSubstring(input);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void testLongestPalindromicSubstring_pwwkew() {
        String input = "pwwkew";
        int expectedOutput = 3;
        int result = LengthOfLongestSubstring.lengthOfLongestSubstring(input);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void testLongestPalindromicSubstring_() {
        String input = "";
        int expectedOutput = 0;
        int result = LengthOfLongestSubstring.lengthOfLongestSubstring(input);

        assertEquals(expectedOutput, result);
    }


}
