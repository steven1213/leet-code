package com.steven.leetcode.array;

/**
 * @Description: TODO. @Author: steven. @CreateTime: 2019-06-28 17:49. Copyright © 2019
 * ,www.oneiotworld.com All Rights Reserved.
 */
public class DuplicateZeros_1089_02 {
  public void duplicateZeros(int[] arr) {
    int len = arr.length;
    int[] result = new int[len];
    int index = 0;
    for (int i = 0; i < len; i++) {
      if (index > len - 1) {
        break;
      }
      result[index++] = arr[i];
      if (arr[i] == 0) {
        index++;
      }
    }
    System.arraycopy(result, 0, arr, 0, len);
  }
}
