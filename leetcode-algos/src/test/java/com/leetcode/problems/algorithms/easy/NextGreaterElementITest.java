package com.leetcode.problems.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for ClimbingStairs.
 */
public class NextGreaterElementITest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test()
    {
        NextGreaterElementI nextGreaterElementI = new NextGreaterElementI();
        int[] response = nextGreaterElementI.nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2});
        assertArrayEquals(new int[]{-1,3,-1},response);
    }

    @Test
    public void test2()
    {
        NextGreaterElementI nextGreaterElementI = new NextGreaterElementI();
        int[] response = nextGreaterElementI.nextGreaterElement(new int[]{1,3,5,2,4},new int[]{6,5,4,3,2,1,7});
        assertArrayEquals(new int[]{7,7,7,7,7},response);
    }

}
