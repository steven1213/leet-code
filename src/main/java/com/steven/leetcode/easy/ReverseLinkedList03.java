package com.steven.leetcode.easy;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-10-27 17:27:23.
 */
public class ReverseLinkedList03 {

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
    System.out.println("1");
  }

  public static ListNode reverseList(ListNode head) {
    ListNode cur = head;
    ListNode prev = null;
    while (cur != null) {
      prev = cur;
      cur = cur.next;
      cur.next = prev;
    }
    return prev;
  }
}
