package com.leetcode.problems.algorithms.easy;



public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if (l1 == null) return l2;
        
        if (l2 == null) return l1;
        
        ListNode listNode = null;
        ListNode head = null;
        
        while (l1 != null && l2 != null) {
            if (listNode == null) {
                listNode = new ListNode(Integer.MIN_VALUE);
                head = listNode;
            }
            if (l1.val <= l2.val) {
                listNode.val = l1.val;
                l1 = l1.next;
            } else {
                listNode.val = l2.val;
                l2 = l2.next;
            }
            if (l1 != null && l2 != null) {
                listNode.next = new ListNode(Integer.MIN_VALUE);
                listNode = listNode.next;
            }  
        }
    
        if (l1 != null) {
            listNode.next = l1;
        } else if (l2 != null) {
            listNode.next = l2;
        }
        
        return head;
    }

    //Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}


