package com.leetcode.problems.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for ClimbingStairs.
 */
public class ClimbingStairsTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testClimbingStairs()
    {
        int n = 10;
        int result = ClimbingStairs.climbStairs(n);
        assertEquals(89, result);
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testClimbingStairs2()
    {
        int n = 2;
        int result = ClimbingStairs.climbStairs(n);
        assertEquals(2, result);
    }


}
