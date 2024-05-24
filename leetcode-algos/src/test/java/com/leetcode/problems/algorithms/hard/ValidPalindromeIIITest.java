package com.leetcode.problems.algorithms.hard;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for ValidPalindromeIIITest.
 */
public class ValidPalindromeIIITest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test()
    {
        ValidPalindromeIII validPalindromeIII = new ValidPalindromeIII();

        assertTrue(validPalindromeIII.isValidPalindromeOptimized("abcdeca", 2));
    }

    @Test
    public void simpleTest()
    {
        ValidPalindromeIII validPalindromeIII = new ValidPalindromeIII();

        assertTrue(validPalindromeIII.isValidPalindromeOptimized("aba", 0));
    }
}
