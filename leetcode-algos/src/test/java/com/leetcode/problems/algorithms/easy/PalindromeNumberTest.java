package com.leetcode.problems.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for PalindromeNumberTest.
 */
public class PalindromeNumberTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testPalindromeNumber()
    {
        int input = 121;

        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean res = palindromeNumber.isPalindrome(input);

        assertTrue(res);
    }

    @Test
    public void testPalindromeNumber10()
    {
        int input = 10;

        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean res = palindromeNumber.isPalindrome(input);

        assertFalse(res);
    }

    @Test
    public void testPalindromeNumber100()
    {
        int input = 100;

        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean res = palindromeNumber.isPalindrome(input);

        assertFalse(res);
    }

    @Test
    public void testPalindromeNumber1001()
    {
        int input = 1001;

        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean res = palindromeNumber.isPalindrome(input);

        assertTrue(res);
    }
}
