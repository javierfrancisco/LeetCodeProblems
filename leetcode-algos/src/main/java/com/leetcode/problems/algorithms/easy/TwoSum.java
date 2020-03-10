package com.leetcode.problems.algorithms.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 */
public class TwoSum
{
    public static void main( String[] args )
    {
        int[] twoSum = new int[] {2, 7, 11,15};
        int target = 9;
        int[] result = twoSum(twoSum, target);
        System.out.println( result);
    }


    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> valueIndexMap = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (valueIndexMap.containsKey(complement)) {
                return new int[] {valueIndexMap.get(complement), i};
            }
            valueIndexMap.put(nums[i], i);
        }
        return null;
    }
}
