package com.leetcode.problems.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for TwoSum.
 */
public class IsSubsequenceTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testIsSubsequence()
    {
        String s = "abc";
        String t = "ahbgdc";
        boolean result = IsSubsequence.isSubsequence(s, t);
        assertEquals(true, result);
    }

}
