package com.leetcode.problems.algorithms.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for ContainerWithMostWater.
 */
public class ContainerWithMostWaterTest
{

    @Test
    public void testContainerWithMostWater()
    {
        int[] input = new int[]{1,1};

        int expectedOutput = 1;
        int result = ContainerWithMostWater.maxArea(input);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void testContainerWithMostWater_arr()
    {
        int[] input = new int[]{1,8,6,2,5,4,8,3,7};

        int expectedOutput = 49;
        int result = ContainerWithMostWater.maxArea(input);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void testContainerWithMostWater_arr2()
    {
        int[] input = new int[]{4,3,2,1,4};

        int expectedOutput = 16;
        int result = ContainerWithMostWater.maxArea(input);

        assertEquals(expectedOutput, result);
    }

    @Test
    public void testContainerWithMostWater_arr3()
    {
        int[] input = new int[]{1,2,1};

        int expectedOutput = 2;
        int result = ContainerWithMostWater.maxArea(input);

        assertEquals(expectedOutput, result);
    }

}
