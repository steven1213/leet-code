package com.steven.leetcode.easy;

import java.util.Map;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-08-12 19:45:06.
 */
public class TitleToNumber {
  public static void main(String[] args) {
    String str = "AAA";
    int result = titleToNumber(str);
    System.out.println("result is:" + result);
  }

  public static int titleToNumber(String s) {
    int sum = 0;
    int len = s.length();
    for (int i = len - 1; i >= 0; i--) {
      char tmp = s.charAt(len - i - 1);
      if (i == 0) {
        sum += tmp - 'A' + 1;
      } else {
        sum += (tmp - 'A' + 1) * Math.pow(26, i);
      }
    }

    return sum;
  }
}
