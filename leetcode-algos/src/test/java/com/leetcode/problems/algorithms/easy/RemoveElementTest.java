package com.leetcode.problems.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for TwoSum.
 */
public class RemoveElementTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test()
    {
        int[] nums = new int[]{3, 2, 2, 3};
        int val = 3;
        RemoveElement removeElement = new RemoveElement();
        int k = removeElement.removeElement(nums, val);

        assertEquals(2, k);
    }


}
