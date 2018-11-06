package com.steven.leetcode.hard;

import java.awt.geom.FlatteningPathIterator;
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
    String s = "84656e656D";

    System.out.println(isNumber(s));
  }

  public static boolean isNumber(String s) {
    boolean result;
    Character str = s.charAt(s.length() - 1);
    if (str == 'l' || str == 'L' || str == 'f' || str == 'F' || str == 'd' || str == 'D') {
      result = false;
    } else {
      try {
        Float.valueOf(s);
        result = true;
      } catch (Exception e) {
        result = false;
      }
    }
    return result;
  }
}
