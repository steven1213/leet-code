package com.steven.leetcode.easy;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-07-18 11:18:02.
 */
public class GetSum {

  public static void main(String[] args) {
    //
    int a = 20;
    int b = 30;
    System.out.println("a=" + Integer.toBinaryString(a));
    System.out.println("b=" + Integer.toBinaryString(b));
    int c = getSum(a, b);
    System.out.println("sum is:" + c);
  }

  public static int getSum(int a, int b) {
    int result = 0;
    int jw = a & b;
    System.out.println("jw=" + Integer.toBinaryString(jw));
    int jg = a ^ b;
    System.out.println("jg=" + Integer.toBinaryString(jg));
    result = jw ^ jg;
    while (jw > 0) {
      jw = (jw << 1) & jg;
      jg = jw ^ jg;
    }

    return result;
  }
}
