package com.steven.leetcode.easy;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-10-26 11:22:22.
 */
public class RobotReturnToOrigin01 {
  public static void main(String[] args) {
    String moves = "UD";
    boolean result = judgeCircle02(moves);
    System.out.println("result is:" + result);
  }

  public static boolean judgeCircle01(String moves) {
    int x = 0;
    int y = 0;
    boolean result = true;
    if (null == moves) {
      return result;
    }
    int len = moves.length();
    for (int i = 0; i < len; i++) {
      char temp = moves.charAt(i);
      if (temp == (char) 'L') {
        x += -1;
      } else if (temp == (char) 'R') {
        x += 1;
      } else if (temp == (char) 'U') {
        y += 1;
      } else if (temp == (char) 'D') {
        y += -1;
      }
    }
    if (x == 0 && y == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean judgeCircle02(String moves) {
    int x = 0;
    int y = 0;
    boolean result = true;
    if (null == moves) {
      return result;
    }
    char[] arrs = moves.toCharArray();
    int len = arrs.length;
    for (int i = 0; i < len; i++) {
      char temp = arrs[i];
      if (temp == (char) 'L') {
        x += -1;
      } else if (temp == (char) 'R') {
        x += 1;
      } else if (temp == (char) 'U') {
        y += 1;
      } else if (temp == (char) 'D') {
        y += -1;
      }
    }
    if (x == 0 && y == 0) {
      return true;
    } else {
      return false;
    }
  }
}
