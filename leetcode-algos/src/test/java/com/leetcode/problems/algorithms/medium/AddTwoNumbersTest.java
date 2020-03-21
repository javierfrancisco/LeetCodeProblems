package com.leetcode.problems.algorithms.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for TwoSum.
 */
public class AddTwoNumbersTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testIsSubsequence()
    {
        /*
        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
        Output: 7 -> 0 -> 8
        Explanation: 342 + 465 = 807.
         */
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        AddTwoNumbers.ListNode listNode2 = new AddTwoNumbers.ListNode(2);
        AddTwoNumbers.ListNode listNode4 = new AddTwoNumbers.ListNode(4);
        AddTwoNumbers.ListNode listNode3 = new AddTwoNumbers.ListNode(3);
        listNode2.next = listNode4;
        listNode4.next = listNode3;

        AddTwoNumbers.ListNode listNodeB5 = new AddTwoNumbers.ListNode(5);
        AddTwoNumbers.ListNode listNodeB6 = new AddTwoNumbers.ListNode(6);
        AddTwoNumbers.ListNode listNodeB4 = new AddTwoNumbers.ListNode(4);
        listNodeB5.next = listNodeB6;
        listNodeB6.next = listNodeB4;

        AddTwoNumbers.ListNode result = AddTwoNumbers.addTwoNumbers(listNode2, listNodeB5);
        System.out.println("");
        //int[][] events = new int[][] {{1,2},{1,3}, {1,3}};
        //int result = MaxNumOfEventsThatCanBeAttended.maxEvents(events);
        //assertEquals(3, result);
    }

}
