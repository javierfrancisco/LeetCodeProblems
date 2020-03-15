package com.leetcode.problems.algorithms.hard;


import java.util.ArrayList;
import java.util.List;

/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
 *
 *
 * The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!
 *
 * Example:
 *
 * Input: [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 */
public class TrappingRainWater {


    /**
     * Using 2 pointers
     * Instead of computing the left and right parts seperately, we may think
     * of some way to do it in one iteration.
     * As long as rightPointer[i]>\text{left\_max}[i]right_max[i]>left_max[i]
     * (from element 0 to 6), the water trapped depends upon the left_max, and similar is the
     * case when \text{left\_max}[i]>\text{right\_max}[i]left_max[i]>right_max[i] (from element 8 to 11).
     * So, we can say that if there is a larger bar at one end (say right), we are assured that
     * the water trapped would be dependant on height of bar in current direction (from left to right).
     * As soon as we find the bar at other end (right) is smaller, we start iterating in opposite
     * direction (from right to left). We must maintain \text{left\_max}left_max
     * and \text{right\_max}right_max during the iteration, but now we can do it in one iteration
     * using 2 pointers, switching between the two.
     *
     *
     * @param height the array of heights
     * @return the total amount of trapped water
     */
    public static int trap(int[] height) {
         int n = height.length;
         int leftPointer = 0;
         int rightPointer = n - 1;
         int leftMax = 0;
         int rightMax = 0;
         int trappedWater = 0;

         while (leftPointer < rightPointer) {
            if (height[leftPointer] < height[rightPointer]){
                if (height[leftPointer] >= leftMax) {
                    leftMax = height[leftPointer];
                } else {
                    trappedWater+= leftMax - height[leftPointer];
                }
                ++leftPointer;
            } else {
                if (height[rightPointer] >= rightMax) {
                    rightMax = height[rightPointer];
                } else {
                    trappedWater += rightMax - height[rightPointer];
                }
                --rightPointer;
            }
         }

        return trappedWater;
    }
}
