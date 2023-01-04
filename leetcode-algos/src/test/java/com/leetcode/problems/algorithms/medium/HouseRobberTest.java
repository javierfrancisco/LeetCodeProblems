package com.leetcode.problems.algorithms.medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for TwoSum.
 */
public class HouseRobberTest
{
    /**
     *  Input: nums = [2,7,9,3,1]
     *  Output: 12
     */
    @Test
    public void testHouseRobbert()
    {

        int[] nums = new int[]{2,7,9,3,1};

        HouseRobber houseRobber = new HouseRobber();
        int result = houseRobber.rob(nums);
        assertEquals( 12, result);
    }

}
