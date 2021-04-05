package com.leetcode.problems.algorithms.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for ContainerWithMostWater.
 */
public class IntegerToRomanTest
{

    @Test
    public void testIntegerToRomanTest()
    {
        int input = 3;

        String expectedOutput = "III";
        String result = IntegerToRoman.intToRoman(input);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void testIntegerToRomanTest_4()
    {
        int input = 4;

        String expectedOutput = "IV";
        String result = IntegerToRoman.intToRoman(input);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void testIntegerToRomanTest_9()
    {
        int input = 9;

        String expectedOutput = "IX";
        String result = IntegerToRoman.intToRoman(input);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void testIntegerToRomanTest_58()
    {
        int input = 58;

        String expectedOutput = "LVIII";
        String result = IntegerToRoman.intToRoman(input);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void testIntegerToRomanTest_1994()
    {
        int input = 1994;

        String expectedOutput = "MCMXCIV";
        String result = IntegerToRoman.intToRoman(input);

        assertEquals(expectedOutput, result);
    }

}
