package com.leetcode.problems.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for TwoSum.
 */
public class ReverseIntegerTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testReverseInteger()
    {
        int result = ReverseInteger.reverse(123);
        assertEquals(321, result);
    }

    @Test
    public void testReverseIntegerNegative()
    {
        int result = ReverseInteger.reverse(-123);
        assertEquals(-321, result);
    }

    @Test
    public void testReverseIntegerMaxValue()
    {
        int result = ReverseInteger.reverse(1534236469);
        assertEquals(0, result);
    }

    @Test
    public void testReverseIntegerMinValue()
    {
        int result = ReverseInteger.reverse(-2147483648);
        assertEquals(0, result);

    }
}
