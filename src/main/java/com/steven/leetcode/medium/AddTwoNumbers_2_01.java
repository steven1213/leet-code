package com.steven.leetcode.medium;

import com.steven.leetcode.common.ListNode;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example:
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers_2_01 {
    private static ListNode l1, l2;

    public static void main(String[] args) {
        l1 = ListNode.initListNode(new int[]{2, 4, 3});
        l2 = ListNode.initListNode(new int[]{5, 6, 4});
        ListNode result = addTwoNumbers(l1, l2);
        ListNode.printListNode(result);
    }

    /**
     *
     * @param l1 ListNode 1
     * @param l2 ListNode 2
     * @return ListNode
     */
    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode(0);
        ListNode p1 = l1, p2 = l2, curr = resultNode;
        int carry = 0;
        while (p1 != null || p2 != null) {
            int x = (p1 != null) ? p1.value : 0;
            int y = (p2 != null) ? p2.value : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p1 != null) {
                p1 = p1.next;
            }
            if (p2 != null) {
                p2 = p2.next;
            }
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return resultNode.next;
    }
}
