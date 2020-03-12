package com.leetcode.problems.algorithms.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for TwoSum.
 */
public class MaxNumOfEventsThatCanBeAttendedTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testIsSubsequence()
    {
        int[][] events = new int[][] {{1,2},{1,3}, {1,3}};
        int result = MaxNumOfEventsThatCanBeAttended.maxEvents(events);
        assertEquals(3, result);
    }

}
