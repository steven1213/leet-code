package com.steven.leetcode.week_contest;

import java.util.Arrays;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-07-27 15:34:07.
 */
public class BuddyStrings {
  public static void main(String[] args) {
    String A = "ab";
    String B = "ba";
    boolean result = buddyStrings(A, B);
    System.out.println("result is:" + result);
  }

  public static boolean buddyStrings(String A, String B) {
    int lenA = A.length();
    int lenB = B.length();
    if (lenA != lenB) {
      return false;
    }
    char[] tempA = A.toCharArray();
    char[] tempB = B.toCharArray();
    Arrays.sort(tempA);
    Arrays.sort(tempB);
    String sortA = new String(tempA);
    String sortB = new String(tempB);
    if (!sortA.equalsIgnoreCase(sortB)) {
      return false;
    }
    return true;
  }
}
