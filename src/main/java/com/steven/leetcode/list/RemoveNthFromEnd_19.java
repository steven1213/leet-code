package com.steven.leetcode.list;

import com.steven.leetcode.ListNode;

/**
 * @Description: TODO. @Author: steven. @CreateTime: 2019-06-27 16:24. Copyright © 2019
 * ,www.oneiotworld.com All Rights Reserved.
 */
public class RemoveNthFromEnd_19 {

  public static void main(String[] args) {
    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    node1.next = node2;
    // ListNode node3 = new ListNode(3);
    // node2.next = node3;
    // ListNode node4 = new ListNode(4);
    // node3.next = node4;
    // ListNode node5 = new ListNode(5);
    // node4.next = node5;
    // ListNode node6 = new ListNode(6);
    // node5.next = node6;
    // ListNode node7 = new ListNode(7);
    // node6.next = node7;
    // ListNode node8 = new ListNode(8);
    // node7.next = node8;
    // ListNode node9 = new ListNode(9);
    // node8.next = node9;
    // ListNode node10 = new ListNode(10);
    // node9.next = node10;

    removeNthFromEnd(node1, 1);
  }

  public static ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode current = head;

    if ((head == null) || (head.next == null && n == 1)) {
      return null;
    }

    while (current != null) {
      ListNode pre = current;
      for (int i = 0; i < n - 1; i++) {
        pre = pre.next;
      }
      if (pre == null) {
        current.next = null;
        break;
      } else if (pre.next == null) {
        if (current == head && n != 1) {
          head = current.next;
        } else {
        }
        break;
      }
      current = current.next;
    }
    return head;
  }
}
