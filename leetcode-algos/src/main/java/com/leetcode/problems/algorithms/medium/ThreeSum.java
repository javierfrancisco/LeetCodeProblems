package com.leetcode.problems.algorithms.medium;


import java.util.*;

/**
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 *
 * Note:
 *
 * The solution set must not contain duplicate triplets.
 *
 * Example:
 *
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 *
 * A solution set is:
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 */
public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        int n = nums.length;
        int targetSum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {

            int leftPointer = i + 1;
            int rightPointer = n - 1;
            int x = nums[i];

            while (leftPointer < rightPointer) {
                int sumValue = x + nums[leftPointer] + nums[rightPointer];
                if (sumValue == targetSum) {
                    //triplet found
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[leftPointer]);
                    triplet.add(nums[rightPointer]);
                    result.add(triplet);
                }
                if (sumValue < targetSum) {
                    leftPointer++;
                } else {
                    rightPointer--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}
