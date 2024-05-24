package com.leetcode.problems.algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for TwoSum.
 */
public class MergeTwoListsTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testMergeTwoLists()
    {
        //Input: list1 = [1,2,4], list2 = [1,3,4]
        //Output: [1,1,2,3,4,4]
        MergeTwoLists mergeTwoLists = new MergeTwoLists();

        MergeTwoLists.ListNode list1 = mergeTwoLists.new ListNode(1);
        MergeTwoLists.ListNode list1A = mergeTwoLists.new ListNode(2, list1);
        MergeTwoLists.ListNode list1B = mergeTwoLists.new ListNode(4, list1A);


        MergeTwoLists.ListNode list2 = mergeTwoLists.new ListNode(1);
        MergeTwoLists.ListNode list2A = mergeTwoLists.new ListNode(3, list2);
        MergeTwoLists.ListNode list2B = mergeTwoLists.new ListNode(4, list2A);

        MergeTwoLists.ListNode response = mergeTwoLists.mergeTwoLists(list1B, list2B);

        //int[] twoSum = new int[] {2, 7, 11,15};
        //int target = 9;
        //int[] result = TwoSum.twoSum(twoSum, target);

        //assertArrayEquals(new int[] {0, 1}, result);
    }
}
