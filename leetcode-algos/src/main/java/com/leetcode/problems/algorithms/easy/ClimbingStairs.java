package com.leetcode.problems.algorithms.easy;

import java.util.HashMap;

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
public class ClimbingStairs {

    private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static int climbStairsDP(int n) {

        if (n <= 2) return n; // Base cases

        //int result = climbStairs(n - 1) + climbStairs(n - 2) ; // Recurrence relation

        if (!memo.containsKey(n)) {
            memo.put(n, climbStairsDP(n - 1) + climbStairsDP (n -2));
        }

        return memo.get(n);
    }

    public static int climbStairs(int n) {
        return climbStairsDP(n);
    }


}
