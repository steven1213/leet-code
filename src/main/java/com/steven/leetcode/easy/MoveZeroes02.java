package com.steven.leetcode.easy;

import java.util.ArrayList;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved. @Description:
 *
 * @author: steven. @Date: 2018/11/1 11:46.
 */
public class MoveZeroes02 {
  public static void main(String[] args) {
    // int[] A = new int[] {0, 0};
    int[] A = new int[] {1};

    moveZeroes(A);
  }

  public static void moveZeroes(int[] nums) {
    int len = nums.length;
    int currentIndex = 0;
    for (int i = 0; i < len; i++) {
      if (nums[i] != 0) {
        nums[currentIndex++] = nums[i];
        if (currentIndex != i) {
          nums[i] = 0;
        }
      }
    }
  }
}
