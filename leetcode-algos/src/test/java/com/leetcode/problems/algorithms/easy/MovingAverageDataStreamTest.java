package com.leetcode.problems.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for ClimbingStairs.
 */
public class MovingAverageDataStreamTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test()
    {
        MovingAverageDataStream movingAverage = new MovingAverageDataStream(3);
        assertEquals(1, movingAverage.next(1), .001); // return 1.0 = 1 / 1
        assertEquals(5.5, movingAverage.next(10), .001); // return 5.5 = (1 + 10) / 2
        assertEquals(4.66667, movingAverage.next(3), .001); // return 4.66667 = (1 + 10 + 3) / 3
        assertEquals(6.0 , movingAverage.next(5), .001); // return 6.0 = (10 + 3 + 5) / 3
    }



}
