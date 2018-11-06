package com.steven.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-10-29 11:39:49.
 */
public class SelfDividingNumbers01 {
  public static void main(String[] args) {
    //
    int left = 1;
    int right = 22;
    List<Integer> result = selfDividingNumbers(left, right);
    System.out.println("result is:" + result);
  }

  public static List<Integer> selfDividingNumbers(int left, int right) {
    List<Integer> list = new ArrayList<>();
    for (int i = left; i <= right; i++) {
      if (i < 10) {
        list.add(i);
      } else {
        String temp = String.valueOf(i);
        if (temp.indexOf('0') == -1) {
          boolean result = true;
          int len = temp.length();
          for (int j = 0; j < len; j++) {
            if (i % Integer.valueOf(String.valueOf(temp.charAt(j))) != 0) {
              result = false;
              break;
            }
          }
          if (result) {
            list.add(i);
          }

        } else {
          continue;
        }
      }
    }

    return list;
  }
}
