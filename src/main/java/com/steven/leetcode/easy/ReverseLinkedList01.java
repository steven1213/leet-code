package com.steven.leetcode.easy;

import sun.util.resources.cldr.ebu.CurrencyNames_ebu;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-10-27 17:27:23.
 */
public class ReverseLinkedList01 {

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    ListNode a1 = new ListNode(2);
    ListNode a2 = new ListNode(3);
    ListNode a3 = new ListNode(4);
    ListNode a4 = new ListNode(5);
    head.next = a1;
    a1.next = a2;
    a2.next = a3;
    a3.next = a4;
    ListNode node = reverseList(head);
  }

  public static ListNode reverseList(ListNode head) {
    ListNode node = null;
    return reverse(node, head);
  }

  public static ListNode reverse(ListNode head, ListNode temp) {
    ListNode pre = new ListNode(temp.val);
    if (temp.next != null) {
      head = reverse(head, temp.next);
      ListNode node = head;
      while (node.next != null) {
        node = node.next;
      }
      node.next = pre;
    } else {
      head = pre;
    }
    return head;
  }
}
