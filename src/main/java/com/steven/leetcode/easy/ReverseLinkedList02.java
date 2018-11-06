package com.steven.leetcode.easy;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-10-27 17:27:23.
 */
public class ReverseLinkedList02 {

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
    ListNode node;
    ListNode temp = head;
    int count = 0;
    if (null == head) {
      return null;
    }
    while (temp != null) {
      count++;
      temp = temp.next;
    }
    int a[] = new int[count];
    for (int i = 0; i < count; i++) {
      a[i] = head.val;
      head = head.next;
    }

    node = new ListNode(a[--count]);
    ListNode appNode = node;
    while (count > 0) {
      appNode.next = new ListNode(a[--count]);
      appNode = appNode.next;
    }

    return node;
  }
}
