package com.leetcode.problems.algorithms.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for TwoSum.
 */
public class TopKFrequentElementsTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test()
    {

        int[] nums = new int[]{-1, -1};
        int k = 1;

        TopKFrequentElements program = new TopKFrequentElements();

        int[] result = program.topKFrequent(nums, k);
        assertArrayEquals(new int[]{-1}, result);
    }


}
