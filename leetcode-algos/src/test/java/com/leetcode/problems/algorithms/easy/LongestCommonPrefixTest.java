package com.leetcode.problems.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for LongestCommonPrefix.
 */
public class LongestCommonPrefixTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testLongestCommonPrefix()
    {
        String[] input = new String[] {"flower","flow","flight"};
        String longestPrefix = "fl";
        String result = LongestCommonPrefix.longestCommonPrefix(input);

        assertEquals(longestPrefix, result);
    }

    @Test
    public void testLongestCommonPrefix2()
    {
        String[] input = new String[] {"dog","racecar","car"};
        String longestPrefix = "";
        String result = LongestCommonPrefix.longestCommonPrefix(input);

        assertEquals(longestPrefix, result);
    }
}
