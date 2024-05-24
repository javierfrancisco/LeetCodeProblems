package com.leetcode.problems.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for TwoSum.
 */
public class SearchInsertPositionTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test()
    {
        int[] nums = new int[]{1,3,5,6};
        int target = 5;
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int indexResult = searchInsertPosition.searchInsert(nums, target);
        assertEquals(2, indexResult);

    }

    @Test
    public void test2()
    {
        int[] nums = new int[]{1,3,5,6};
        int target = 2;
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int indexResult = searchInsertPosition.searchInsert(nums, target);
        assertEquals(1, indexResult);

    }

    @Test
    public void test3()
    {
        int[] nums = new int[]{2,4,5,6,7,8};
        int target = 7;
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int indexResult = searchInsertPosition.searchInsert(nums, target);
        assertEquals(4, indexResult);

    }

    @Test
    public void test4()
    {
        int[] nums = new int[]{1,3,5,6};
        int target = 7;
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int indexResult = searchInsertPosition.searchInsert(nums, target);
        assertEquals(4, indexResult);

    }
}
