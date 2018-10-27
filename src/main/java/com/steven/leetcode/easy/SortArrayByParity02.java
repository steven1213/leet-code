package com.steven.leetcode.easy;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-10-25 15:32:31.
 */
public class SortArrayByParity02 {
  public static void main(String[] args) {

    int[] A = new int[] {0,1,2};
    int[] result = sortArrayByParity(A);
    System.out.println("result is:" + result.length);
  }

  public static int[] sortArrayByParity(int[] A) {
    int len = A.length;
    int[] B = new int[len];
    int preIndex = 0;
    int endIndex = len - 1;

    for (int i = 0; i < len; i++) {
      int temp = A[i];
      if (temp % 2 == 0) {
        B[preIndex++] = temp;
      } else {
        B[endIndex--] = temp;
      }
    }
    return B;
  }
}
