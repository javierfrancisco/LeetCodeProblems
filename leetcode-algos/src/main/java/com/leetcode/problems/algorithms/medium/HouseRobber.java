package com.leetcode.problems.algorithms.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * House Robber
 *
 * Solution
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 *
 * Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 * Total amount you can rob = 1 + 3 = 4.
 * Example 2:
 *
 * Input: nums = [2,7,9,3,1]
 * Output: 12
 * Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
 * Total amount you can rob = 2 + 9 + 1 = 12.
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 400
 */
public class HouseRobber {

    private Map<Integer, Integer> memo = new HashMap<>();
    private int[] nums;

    public int rob(int[] nums) {

        this.nums = nums;
        return dp(nums.length - 1);
    }

    /**
     * Top-Down Approach
     *
     * Idea: Use recursion and find base cases
     * Recurrence Relation: If we are at some house logically, we have 2 options: we can choose to rob this house,
     * or we can choose to not rob this house.
     *
     * 1. If we decide not to rob this house, then we don't get any money. Whatever money we had from the previous house
     * is how much money we will have at this house - which is dep(i-1).
     * 2. If we decide to rob the house, then we gain nums[i] money. However, this is only possible if we did not rob
     * the previous house. This means the money we had when arriving at this house is the money we had from the previous
     * house without robbing it, which would be however much money we had 2 houses ago dp(i-2).
     * After robbing the current home, we will have dp(i-2) + nums[i] money.
     *
     * From these two options, we always want to pick the one that gives us maximum profits. Putting it together,
     * we have our recurrence relation: dp(i) = max(dp(i-1), dp(i-2) + nums[i]);
     *
     * Base cases:
     *
     * 1. dp(0) = nums[0]
     * 2. dp(1) = max(nums[0], nums[1])
     *
     */
    public int dp(int i) {
        //Base cases
        if (i == 0) return nums[0];
        if (i == 1) return Math.max(nums[0], nums[1]);

        if (!memo.containsKey(i)) {
            memo.put(i, Math.max(dp(i - 1), dp(i - 2) + nums[i]));//Recurrence relation
        }

        return memo.get(i);
    }



}
