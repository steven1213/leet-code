package com.steven.leetcode.list;

/**
 * @Description: TODO. @Author: steven. @CreateTime: 2019-06-27 14:16. Copyright © 2019
 * ,www.oneiotworld.com All Rights Reserved.
 */
public class MergeKLists_23 {

  public static void main(String[] args) {}

  public ListNode mergeKList(ListNode[] list) {
    int len = list.length;

    if (len == 0) {
      return null;
    }
    if (len == 1) {
      return list[0];
    }
    if (len == 2) {
      return mergeTwoLists(list[0], list[1]);
    }

    int mid = len / 2;
    ListNode[] node1 = new ListNode[mid];
    ListNode[] node2 = new ListNode[len - mid];
    for (int i = 0; i < len; i++) {
      if (i < mid) {
        node1[i] = list[i];
      } else {
        node2[i - mid] = list[i];
      }
    }
    return mergeTwoLists(mergeKList(node1), mergeKList(node2));
  }

  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }
    ListNode head;
    if (l1.val <= l2.val) {
      head = l1;
      head.next = mergeTwoLists(l1.next, l2);
    } else {
      head = l2;
      head.next = mergeTwoLists(l1, l2.next);
    }
    return head;
  }
}
