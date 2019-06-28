package com.steven.leetcode.list;

import com.steven.leetcode.ListNode;
import lombok.val;
import sun.util.resources.cldr.ebu.CurrencyNames_ebu;

import java.util.List;

/**
 * @Description: TODO. @Author: steven. @CreateTime: 2019-06-28 16:39. Copyright © 2019
 * ,www.oneiotworld.com All Rights Reserved.
 */
public class AddTwoNumbers_2 {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    int val1 = l1.val;
    int val2 = l2.val;

    int currentVal = (val1 + val2) / 10 > 0 ? (val1 + val2 - 10) : (val1 + val2);
    int preVal = (val1 + val2) / 10;
    ListNode listNode = new ListNode(currentVal);
    ListNode currentNode = listNode;
    ListNode currentNode1 = l1.next;
    ListNode currentNode2 = l2.next;
    while (!(currentNode1 == null && currentNode2 == null)) {
      if (null != currentNode1) {
        val1 = currentNode1.val;
        currentNode1 = currentNode1.next;
      } else {
        val1 = 0;
      }

      if (null != currentNode2) {
        val2 = currentNode2.val;
        currentNode2 = currentNode2.next;
      } else {
        val2 = 0;
      }

      currentVal = val1 + val2 + preVal;
      int temp;
      if (currentVal >= 10) {
        preVal = 1;
        temp = currentVal - 10;
      } else {
        temp = currentVal;
        preVal = 0;
      }

      ListNode node = new ListNode(temp);
      currentNode.next = node;
      currentNode = currentNode.next;
    }
    if (preVal != 0) {
      ListNode node = new ListNode(preVal);
      currentNode.next = node;
    }

    return listNode;
  }
}
