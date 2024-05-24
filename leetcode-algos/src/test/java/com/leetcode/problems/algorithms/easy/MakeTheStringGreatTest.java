package com.leetcode.problems.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for MakeTheStringGreatTest..
 */
public class MakeTheStringGreatTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test()
    {
        MakeTheStringGreat makeTheStringGreat = new MakeTheStringGreat();
        String s = "Pp";
        String o = makeTheStringGreat.makeGood(s);
        assertEquals("", o);

    }

    @Test
    public void test2()
    {
        MakeTheStringGreat makeTheStringGreat = new MakeTheStringGreat();
        String s = "leEeetcode";
        String o = makeTheStringGreat.makeGood(s);
        assertEquals("leetcode", o);

    }
}
