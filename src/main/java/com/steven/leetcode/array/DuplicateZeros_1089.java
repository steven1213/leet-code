package com.steven.leetcode.array;

/**
 * @Description: TODO. @Author: steven. @CreateTime: 2019-06-28 17:49. Copyright © 2019
 * ,www.oneiotworld.com All Rights Reserved.
 */
public class DuplicateZeros_1089 {
  public void duplicateZeros(int[] arr) {
    int len = arr.length;
    for (int i = 0; i < len; i++) {
      int current = arr[i];
      if (current == 0) {
        for (int j = len - 1; j > i; j--) {
          arr[j] = arr[j - 1];
        }
        if (i + 1 < len) {
          arr[i + 1] = 0;
        }
      }
    }
  }
}
