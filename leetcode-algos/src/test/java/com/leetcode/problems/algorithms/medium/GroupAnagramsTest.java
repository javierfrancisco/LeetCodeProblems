package com.leetcode.problems.algorithms.medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit test for TwoSum.
 */
public class GroupAnagramsTest
{
    /**
     *  Input: nums = [2,7,9,3,1]
     *  Output: 12
     */
    @Test
    public void testHouseRobbert()
    {


        String[] input = new String[]{""};

        GroupAnagrams groupAnagrams = new GroupAnagrams();
        List<List<String>> result = groupAnagrams.groupAnagrams(input);
        assertTrue(result.size() > 0);
    }

}
