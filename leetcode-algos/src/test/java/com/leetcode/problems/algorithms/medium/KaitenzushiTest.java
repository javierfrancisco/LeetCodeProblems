package com.leetcode.problems.algorithms.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for ContainerWithMostWater.
 */
public class KaitenzushiTest
{

    @Test
    public void testKeitenzushi()
    {
        Keitenzushi keitenzushi = new Keitenzushi();

        int N = 6;
        int[] D = new int[]{1,2,3,3,2,1}; 
        int K = 1;
        long result = keitenzushi.getMaximumEatenDishCount(N, D, K);

        assertEquals(5, result);
    }

}
