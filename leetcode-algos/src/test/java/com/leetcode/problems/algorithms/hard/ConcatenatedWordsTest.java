package com.leetcode.problems.algorithms.hard;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit test for TrappingRainWater.
 */
public class ConcatenatedWordsTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test()
    {
        ConcatenatedWords concatenatedWords = new ConcatenatedWords();

        String[] words = new String[]{"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"};
        List<String> result =  concatenatedWords.findAllConcatenatedWordsInADict(words);
        assertNotNull(result);
    }
}
