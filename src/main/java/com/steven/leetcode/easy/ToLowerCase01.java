package com.steven.leetcode.easy;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-10-24 13:16:06.
 */
public class ToLowerCase01 {
  public static void main(String[] args) {
    String str = "LOVELY";

    String result = toLowerCase(str);
    System.out.println("result is :" + result);
  }

  public static String toLowerCase(String str) {
    char[] chars = str.toCharArray();
    int len = chars.length;
    for (int i = 0; i < len; i++) {
      int num = chars[i];
      if (num >= 65 && num <= 90) {
        chars[i] = (char) (chars[i] + 32);
      }
    }

    return String.valueOf(chars);
  }
}
