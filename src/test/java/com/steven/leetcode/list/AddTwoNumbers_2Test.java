package com.steven.leetcode.list;

import com.steven.leetcode.ListNode;
import lombok.Setter;
import org.junit.Before;
import org.junit.Test;

/**
 * @Description: TODO. @Author: steven. @CreateTime: 2019-06-28 16:40. Copyright © 2019
 * ,www.oneiotworld.com All Rights Reserved.
 */
public class AddTwoNumbers_2Test {

  ListNode l1;
  ListNode l2;

  @Before
  public void init() {
    l1 = new ListNode(2);
    ListNode l11 = new ListNode(4);
    l1.next = l11;
    ListNode l12 = new ListNode(3);
    l11.next = l12;

    l2 = new ListNode(5);
    ListNode l21 = new ListNode(6);
    l2.next = l21;
    ListNode l22 = new ListNode(4);
    l21.next = l22;
  }

  @Test
  public void addTwoNumbers() throws Exception {

    ListNode node = new AddTwoNumbers_2().addTwoNumbers(l1, l2);
    StringBuilder sb = new StringBuilder();
    sb.append(node.val);
    ListNode current = node;
    while (current.next != null) {
      sb.append("->").append(current.next);
      current = current.next;
    }
    if (current != null) {
      sb.append("->").append(current.val);
    }
  }
}
