package com.leetcode.problems.algorithms.easy;

import org.junit.Test;


import static org.junit.Assert.*;

/**
 * Unit test for TwoSum.
 */
public class TwoSumTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testTwoSum()
    {
        int[] twoSum = new int[] {2, 7, 11,15};
        int target = 9;
        int[] result = TwoSum.twoSum(twoSum, target);

        assertArrayEquals(new int[] {0, 1}, result);
    }
}
