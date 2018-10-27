package com.steven.leetcode.easy;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.util.List;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-10-27 16:53:05.
 */
class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
    next = null;
  }
}

public class IntersectionOfTwoLinkedLists01 {

  public static void main(String[] args) {
    ListNode headA = new ListNode(11);
    //ListNode a1 = new ListNode(12);
    //ListNode a2 = new ListNode(13);
    //ListNode a3 = new ListNode(14);
    //ListNode a4 = new ListNode(15);
    //ListNode a5 = new ListNode(16);
    //headA.next = a1;
    //a1.next = a2;
    //a2.next = a3;
    //a3.next = a4;
    //a4.next = a5;

    ListNode headB = new ListNode(21);
    headA.next=headB;
    // ListNode b1 = new ListNode(22);
    // ListNode b2 = new ListNode(23);
    // headB.next = b1;
    // b1.next = b2;
    // b2.next = a4;

    ListNode result = getIntersectionNode(headB, headA);
    if (null == result) {
      System.out.println("null");
    } else {
      System.out.println(result.val);
    }
  }

  public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

    int lenA = 0;
    int lenB = 0;
    ListNode temp1 = headA;
    ListNode temp2 = headB;
    if (temp1 == null || temp2 == null) {
      return null;
    }
    while (temp1 != null) {
      temp1 = temp1.next;
      lenA += 1;
    }
    while (temp2 != null) {
      temp2 = temp2.next;
      lenB++;
    }

    if (lenA >= lenB) {
      for (int i = 0; i < lenA - lenB; i++) {
        headA = headA.next;
      }

      for (int i = 0; i < lenB; i++) {

        if (headA.equals(headB)) {
          return headA;
        }
        headA = headA.next;
        headB = headB.next;
      }
    } else {
      for (int i = 0; i < lenB - lenA; i++) {
        headB = headB.next;
      }

      for (int i = 0; i < lenA; i++) {
        if (headA.equals(headB)) {
          return headA;
        }
        headA = headA.next;
        headB = headB.next;
      }
    }
    return null;
  }
}
