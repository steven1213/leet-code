package com.steven.leetcode.easy;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 * String.charAt 效率低于将String 转成char数组
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-10-26 11:22:22.
 */
public class RobotReturnToOrigin02 {
  public static void main(String[] args) {
    String moves = "UD";
    boolean result = judgeCircle(moves);
    System.out.println("result is:" + result);
  }

  public static boolean judgeCircle(String moves) {
    int x = 0;
    int _x = 0;
    int y = 0;
    int _y = 0;
    boolean result = true;
    if (null == moves) {
      return result;
    }
    char[] arrs = moves.toCharArray();
    int len = arrs.length;
    for (int i = 0; i < len; i++) {
      char temp = arrs[i];
      if (temp == (char) 'L') {
        x +=1;
      } else if (temp == (char) 'R') {
        _x += 1;
      } else if (temp == (char) 'U') {
        y += 1;
      } else if (temp == (char) 'D') {
        _y += 1;
      }
    }
    if (x == _x && y == _y) {
      return true;
    } else {
      return false;
    }
  }
}
