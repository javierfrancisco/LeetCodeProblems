package com.leetcode.problems.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for TwoSum.
 */
public class ValidParenthesesTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testValidParentheses()
    {
        String input = "{[]}";

        assertTrue(ValidParentheses.isValid2(input));
    }

    @Test
    public void testValidParenthesesForInvalid()
    {
        String input = "{[}";

        assertFalse(ValidParentheses.isValid2(input));
    }

    @Test
    public void testValidParenthesesForValidParentheses()
    {
        String input = "()";

        assertTrue(ValidParentheses.isValid2(input));
    }

    @Test
    public void testValidParenthesesForInvalidSingle()
    {
        String input = "{";

        assertFalse(ValidParentheses.isValid2(input));
    }


    @Test
    public void testValidParenthesesForInvalidSingleEnd()
    {
        String input = "}";

        assertFalse(ValidParentheses.isValid2(input));
    }

    @Test
    public void testValidParenthesesForInvalidSingleEndSquare()
    {
        String input = "]";

        assertFalse(ValidParentheses.isValid2(input));
    }
}
