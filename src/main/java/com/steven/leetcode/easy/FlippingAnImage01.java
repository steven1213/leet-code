package com.steven.leetcode.easy;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-10-26 13:21:12.
 */
public class FlippingAnImage01 {
  public static void main(String[] args) {
    int[][] a = new int[][] {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};

    int[][] b = flipAndInvertImage2(a);
    System.out.println(b.length);
  }

  public static int[][] flipAndInvertImage(int[][] A) {
    int lenA = A.length;
    int lenB = A[0].length;
    int[][] B = new int[lenA][lenB];
    for (int i = 0; i < lenA; i++) {

      for (int j = 0; j < lenB; j++) {
        A[i][j] = A[i][j] ^ 1;
      }
      for (int j = 0; j < lenB; j++) {
        B[i][j] = A[i][lenB - j - 1];
      }
    }
    return B;
  }

  public static int[][] flipAndInvertImage2(int[][] A) {
    int lenA = A.length;
    int lenB = A[0].length;
    int[][] B = new int[lenA][lenB];
    for (int i = 0; i < lenA; i++) {

      for (int j = 0; j < lenB / 2; j++) {
        int pre = A[i][j] ^ 1;
        int suf = A[i][lenB - j - 1] ^ 1;
        A[i][j] = suf;
        A[i][lenB - j - 1] = pre;
      }
      if (lenB % 2 != 0) {
        A[i][lenB / 2] = A[i][lenB / 2] ^ 1;
      }
    }
    return A;
  }
}
