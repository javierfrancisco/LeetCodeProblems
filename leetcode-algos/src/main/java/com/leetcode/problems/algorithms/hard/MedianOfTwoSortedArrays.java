package com.leetcode.problems.algorithms.hard;


/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 *
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 *
 * You may assume nums1 and nums2 cannot be both empty.
 *
 * Example 1:
 *
 * nums1 = [1, 3]
 * nums2 = [2]
 *
 * The median is 2.0
 * Example 2:
 *
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 *
 * The median is (2 + 3)/2 = 2.5
 */
public class MedianOfTwoSortedArrays {


    /**
     * Runtime: 2 ms, faster than 99.80% of Java online submissions for Median of Two Sorted Arrays.
     * Memory Usage: 40.4 MB, less than 100.00% of Java online submissions for Median of Two Sorted Arrays.
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1L = nums1.length;
        int nums2L = nums2.length;

        int n = nums1L + nums2L;
        boolean isEvenNumber = n % 2 == 0;

        int middleIndex = (n / 2) + 1;
        int current = 0;
        int currentVal = 0;
        int previousVal = 0;
        int nums1I = 0;
        int nums2I = 0;

        while (current < middleIndex) {
            previousVal = Math.max(currentVal, previousVal);
            if (nums1I == nums1L) {
                currentVal = nums2[nums2I];
                nums2I++;
            } else if (nums2I == nums2L){
                currentVal = nums1[nums1I];
                nums1I++;
            } else if (nums1[nums1I] <= nums2[nums2I]) {
                currentVal = nums1[nums1I];
                nums1I++;
            } else {
                currentVal = nums2[nums2I];
                nums2I++;
            }
            current++;
        }
        return isEvenNumber ? (currentVal + previousVal) / 2.0 : currentVal;
    }

}
