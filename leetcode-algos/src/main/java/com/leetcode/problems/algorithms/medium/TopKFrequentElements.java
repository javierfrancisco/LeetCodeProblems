package com.leetcode.problems.algorithms.medium;

import java.util.*;

/**
 * Top K Frequent Elements
 *
 * Given an integer array nums and an integer k, return the k most frequent elements.
 * You may return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 *
 * Input: nums = [1], k = 1
 * Output: [1]
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 * k is in the range [1, the number of unique elements in the array].
 * It is guaranteed that the answer is unique.
 *
 *
 * Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */
public class TopKFrequentElements {


    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numFrequencyMap = new HashMap<>();

        for (int i: nums) {
            if (!numFrequencyMap.containsKey(i)) {
                numFrequencyMap.put(i, 1);
            } else {
                numFrequencyMap.put(i, numFrequencyMap.get(i) + 1);
            }
        }

        List<List<Integer>> numsWithFrequency = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : numFrequencyMap.entrySet()) {
            List<Integer> currentNumResult = new ArrayList<>();
            currentNumResult.add(entry.getKey());
            currentNumResult.add(entry.getValue());
            numsWithFrequency.add(currentNumResult);
        }

        numsWithFrequency.sort((f1, f2) -> {
            return f2.get(1) - f1.get(1);
        });

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            List<Integer> res = numsWithFrequency.get(i);
            result[i] = res.get(0);
        }

        return result;
    }
}
