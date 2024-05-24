package com.leetcode.problems.algorithms.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for ContainerWithMostWater.
 */
public class CafeteriaTest
{

    @Test
    public void test()
    {
        Cafeteria cafeteria = new Cafeteria();

        long N = 10;
        long K = 1; 
        int M = 2;
        long[] S = new long[]{2,6};
        long result = cafeteria.getMaxAdditionalDinersCount(N, K, M, S);

        assertEquals(3, result);
    }

}
