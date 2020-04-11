package com.leetcode.problems.algorithms.medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;

/**
 * Unit test for TwoSum.
 */
public class ThreeSumTest
{
    /**
     * Given array nums = [-1, 0, 1, 2, -1, -4],
     *
     * A solution set is:
     * [
     *   [-1, 0, 1],
     *   [-1, -1, 2]
     * ]
     */
    @Test
    public void testThreeSum()
    {
        int[] input = new int[]{-1, 0, 1, 2, -1, -4};
        Integer[][] expectedOutput = new Integer[][]{{-1,-1,2},{-1,0,1}};
        List<List<Integer>> result = ThreeSum.threeSum(input);

        int[][] array2d = result.stream()
                .map(l -> l.stream().mapToInt(i->i).toArray())
                .toArray(int[][]::new);
        assertArrayEquals(expectedOutput, array2d);
    }

    @Test
    public void testThreeSum2()
    {
        int[] input = new int[]{0,0,0,0};
        Integer[][] expectedOutput = new Integer[][]{{0,0,0}};
        List<List<Integer>> result = ThreeSum.threeSum(input);

        int[][] array2d = result.stream()
                .map(l -> l.stream().mapToInt(i->i).toArray())
                .toArray(int[][]::new);
        assertArrayEquals(expectedOutput, array2d);
    }
}
