package com.leetcode.problems.algorithms.easy;


import java.util.*;

/**
 * 496. Next Greater Element I
Easy
Topics
Companies
The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.

Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.

 

Example 1:

Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
Example 2:

Input: nums1 = [2,4], nums2 = [1,2,3,4]
Output: [3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
- 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.
 

Constraints:

1 <= nums1.length <= nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 104
All integers in nums1 and nums2 are unique.
All the integers of nums1 also appear in nums2.
 

Follow up: Could you find an O(nums1.length + nums2.length) solution?

 */
public class NextGreaterElementI {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        //Idea: create a map of responses, key is value in array, and value is the next greater element
        //use a monotonic descending stack for the values
        //compare with last element in stack , when new value is greater than last value in stack then pop 
        // and create a result, else continue to add to stack
        // after traversin all elements in nums2, for each value in stack, there was no greater value, hence add -1
        //finally build response iterating map
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> responseMap = new HashMap<>();
        int n = nums2.length;
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                responseMap.put(stack.pop(), nums2[i]);
            }
            stack.add(nums2[i]);
        }
        while(!stack.isEmpty()) {
            responseMap.put(stack.pop(), -1);
        }

        int m = nums1.length;
        int[] ans = new int[m];
        for (int i = 0; i < m; i++){
            ans[i] = responseMap.get(nums1[i]);
        }
        
        return ans;
    }
}
