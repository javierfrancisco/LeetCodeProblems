package com.leetcode.problems.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for TwoSum.
 */
public class RomanToIntegerTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testRomanToInteger()
    {
        String input = "MMXXII";
        int result = RomanToInteger.romanToInt(input);

        assertEquals(2020, result);
    }
}
