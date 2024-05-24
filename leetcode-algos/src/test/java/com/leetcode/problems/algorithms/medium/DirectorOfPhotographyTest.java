package com.leetcode.problems.algorithms.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for DirectorOfPhotographyTest.
 */
public class DirectorOfPhotographyTest
{

    @Test
    public void test()
    {
        DirectorOfPhotography directorOfPhotography = new DirectorOfPhotography();

        int N = 5;
        String C = "APABA"; 
        int X = 1;
        int Y = 2;;

        int result = directorOfPhotography.getArtisticPhotographCountOptimized(N, C,  X,  Y);

        assertEquals(1, result);
    }

    @Test
    public void testCase2()
    {
        DirectorOfPhotography directorOfPhotography = new DirectorOfPhotography();

        int N = 5;
        String C = "APABA"; 
        int X = 2;
        int Y = 3;;

        int result = directorOfPhotography.getArtisticPhotographCountOptimized(N, C,  X,  Y);

        assertEquals(0, result);
    }
}
