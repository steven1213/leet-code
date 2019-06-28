package com.steven.leetcode;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description: TODO. @Author: steven. @CreateTime: 2019-06-27 16:20. Copyright © 2019
 * ,www.oneiotworld.com All Rights Reserved.
 */
@Setter
@Getter
public class ListNode {
  public int val;

  public ListNode next;

  public ListNode(int x) {
    val = x;
  }
}
