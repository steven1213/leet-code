package com.steven.leetcode.easy;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-10-25 15:32:31.
 */
public class SortArrayByParity03 {
  public static void main(String[] args) {

    int[] A = new int[] {3,1,2,4};
    int[] result = sortArrayByParity(A);
    System.out.println("result is:" + result.length);
  }

  public static int[] sortArrayByParity(int[] A) {
    int len = A.length;
    int j = len - 1;
    for (int i = 0; i < j; ) {
      int preA = A[i];
      int sufA = A[j];

      while ((preA & 1) != 1 && i < len - 1) {
        preA = A[++i];
      }

      while ((sufA & 1) == 1 && j > 0) {
        sufA = A[--j];
      }
      if (i <= j) {
        A[j] = preA;
        A[i] = sufA;
      }
    }
    return A;
  }
}
