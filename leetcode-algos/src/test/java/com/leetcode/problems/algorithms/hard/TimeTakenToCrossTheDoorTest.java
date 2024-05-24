package com.leetcode.problems.algorithms.hard;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit test for TrappingRainWater.
 */
public class TimeTakenToCrossTheDoorTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test()
    {
        TimeTakenToCrossTheDoor timeTakenToCrossTheDoor = new TimeTakenToCrossTheDoor();

        int[] arrival = new int[]{0,1,1,2,4};
        int[] state = new int[]{0,1,0,0,1};
        int[] result = timeTakenToCrossTheDoor.timeTaken(arrival, state);

        assertArrayEquals(new int[]{0,3,1,2,4}, result);
    }
}
