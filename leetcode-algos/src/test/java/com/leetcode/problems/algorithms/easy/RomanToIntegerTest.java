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

        assertEquals(2022, result);
    }

    @Test
    public void testRomanToIntegerFour()
    {
        String input = "IV";
        int result = RomanToInteger.romanToInt(input);

        assertEquals(4, result);
    }

    @Test
    public void testRomanToIntegerFive()
    {
        String input = "V";
        int result = RomanToInteger.romanToIntReDo(input);

        assertEquals(5, result);
    }

    @Test
    public void testRomanToIntegerThree()
    {
        String input = "III";
        int result = RomanToInteger.romanToIntReDo(input);

        assertEquals(3, result);
    }
    

    @Test
    public void testRomanToInteger1994()
    {
        String input = "MCMXCIV";
        int result = RomanToInteger.romanToIntReDo(input);

        assertEquals(1994, result);
    }

}
