package com.steven.leetcode.hard;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-10-19 16:01:34.
 */
public class ValidNumber01 {
  public static void main(String[] args) {
    String s = "0";

    System.out.println(isNumber(s));
  }

  public static boolean isNumber(String s) {
    boolean result = false;
    try {
      Float num = Float.valueOf(s);
      result = true;
    } catch (Exception ex) {
      result = false;
    } finally {
      return result;
    }
  }
}
