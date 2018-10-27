package com.steven.leetcode.array;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-10-12 16:17:08.
 */
public class SortArrayByParity {
  public static void main(String[] args) {

    int A[] = new int[] {3, 1, 2, 4};
    int temp[] = sortArrayByParity(A);
    System.out.println(temp.length);
  }

  public static int[] sortArrayByParity(int[] A) {
    int len = A.length;
    int j = len - 1;
    int k = 0;
    int[] temp = new int[len];
    for (int i = 0; k <= j; i++) {
      int a = A[i];
      if (a % 2 == 0) {
        temp[k++] = a;
      } else {
        temp[j--] = a;
      }
    }
    return temp;
  }
}
