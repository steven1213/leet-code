package com.steven.leetcode.array;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-10-12 16:29:38.
 */
public class Transpose {
  public static void main(String[] args) {
    int[][] A = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    int[][] temp = transpose(A);
    System.out.println(temp.length);
  }

  public static int[][] transpose(int[][] A) {
    int len1 = A.length;
    int len2 = A[0].length;
    int[][] temp = new int[len2][len1];

    return temp;
  }
}
