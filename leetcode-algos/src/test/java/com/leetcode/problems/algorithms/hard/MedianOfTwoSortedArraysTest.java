package com.leetcode.problems.algorithms.hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for TrappingRainWater.
 */
public class MedianOfTwoSortedArraysTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testTrappingRainWater()
    {
        int[] input1 = new int[]{1,3};
        int[] input2 = new int[]{2};
        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        double result = medianOfTwoSortedArrays.findMedianSortedArrays(input1, input2);
        assertEquals(2.0, result, 0);
    }

}
