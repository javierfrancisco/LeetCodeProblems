package com.leetcode.problems.algorithms.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 *
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 *
 *
 * Constraints:
 *
 * 1 <= n <= 45
 */
public class RemoveDuplicatesFromSortedArray {

    
    public int removeDuplicates(int[] nums) {
        
        int k = 0;
        int n = nums.length;
        if (n < 1) {
            return k;
        }
        int max = Integer.MAX_VALUE;
        k++;
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);

        for (int j=1; j < n; j++) {
            int current = nums[j];
            if (list.contains(current)){
                nums[j] = max;
            } else {
                list.add(current);
                k++;
            }
        }
        Arrays.sort(nums);

        return k;
    }
}
