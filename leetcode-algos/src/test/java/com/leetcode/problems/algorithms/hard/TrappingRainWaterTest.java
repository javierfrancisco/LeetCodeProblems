package com.leetcode.problems.algorithms.hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for TrappingRainWater.
 */
public class TrappingRainWaterTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testTrappingRainWater()
    {
        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int result = TrappingRainWater.trap(height);
        assertEquals(6, result);
    }

    @Test
    public void testTrappingRainWaterSmall()
    {
        int[] height = new int[]{2,0,2};
        int result = TrappingRainWater.trap(height);
        assertEquals(2, result);
    }

}
