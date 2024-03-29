package com.leetcode.problems.algorithms.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for NumberOfIslands.
 */
public class NumberOfIslandsTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test()
    {

        char[][] grid = new char[][] {{'1','1','1','1','0'},
                                    {'1','1','0','1','0'},
                                    {'1','1','0','0','0'},
                                    {'0','0','0','0','0'},};

        NumberOfIslands program = new NumberOfIslands();

        int result = program.numIslands(grid);
        assertEquals(1, result);
    }


}
