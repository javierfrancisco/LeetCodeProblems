package com.leetcode.problems.algorithms.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for TwoSum.
 */
public class SimplifyPathTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test()
    {

        String input = "/home/";
        String output = "/home";

        SimplifyPath simplifyPath = new SimplifyPath();

        String result = simplifyPath.simplifyPath(input);
        assertEquals(output, result);
    }

    @Test
    public void test1()
    {

        String input = "/../";
        String output = "/";

        SimplifyPath simplifyPath = new SimplifyPath();

        String result = simplifyPath.simplifyPath(input);
        assertEquals(output, result);
    }

    @Test
    public void test2()
    {

        String input = "/home//foo/";
        String output = "/home/foo";

        SimplifyPath simplifyPath = new SimplifyPath();

        String result = simplifyPath.simplifyPath(input);
        assertEquals(output, result);
    }

    @Test
    public void test3()
    {

        String input = "/...";
        String output = "/...";

        SimplifyPath simplifyPath = new SimplifyPath();

        String result = simplifyPath.simplifyPath(input);
        assertEquals(output, result);
    }

    @Test
    public void test4()
    {

        String input = "/a/./b/../../c/";
        String output = "/c";

        SimplifyPath simplifyPath = new SimplifyPath();

        String result = simplifyPath.simplifyPath(input);
        assertEquals(output, result);
    }

    @Test
    public void test5()
    {

        String input = "/a/../../b/../c//.//";
        String output = "/c";

        SimplifyPath simplifyPath = new SimplifyPath();

        String result = simplifyPath.simplifyPath(input);
        assertEquals(output, result);
    }


    @Test
    public void test7()
    {

        String input = "/home/foo/./bar/";
        String output = "/home/foo/bar";

        SimplifyPath simplifyPath = new SimplifyPath();

        String result = simplifyPath.simplifyPath(input);
        assertEquals(output, result);
    }

    @Test
    public void test8()
    {

        String input = "/a//b////c/d//././/..";
        String output = "/a/b/c";

        SimplifyPath simplifyPath = new SimplifyPath();

        String result = simplifyPath.simplifyPath(input);
        assertEquals(output, result);
    }

}
