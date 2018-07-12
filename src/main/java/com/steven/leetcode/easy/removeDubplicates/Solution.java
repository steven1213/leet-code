package com.steven.leetcode.easy.removeDubplicates;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-07-12 18:02:23.
 */
public class Solution {
  public static int removeDuplicates(int[] nums) {
    int count = 0;
    int len = nums.length;
    for (int i = 0; i <= len - 1; i++) {
      int pre = nums[i];

      if (len == 1) {
        return len;
      }
      if (i == len - 1) {
        if (nums[i] != nums[count - 1]) {
          nums[count++] = pre;
        }
      } else {
        nums[count++] = pre;
      }

      for (int j = i + 1; j <= len - 1; j++) {
        int next = nums[j];
        if (next == pre) {
          i = j;
          continue;
        }
        break;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    int[] nums = new int[] {1, 1, 1};
    System.out.println(removeDuplicates(nums));
  }
}
