package com.leetcode.problems.algorithms.easy;

import java.util.Arrays;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        //Idea: Use two pointers to find the location
        //return left pointer, stop when they cross
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int splitIndex = 0;

        while (left <= right) {

            splitIndex = left + (right - left) / 2;

            if (nums[splitIndex] == target) return splitIndex;

            if (nums[splitIndex] < target) {
                left = splitIndex + 1;
            } else {
                right = splitIndex - 1;
            }
        } 
        
        return left;
    }
}


