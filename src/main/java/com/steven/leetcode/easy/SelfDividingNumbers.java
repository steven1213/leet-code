package com.steven.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-07-13 17:29:58.
 */
public class SelfDividingNumbers {

  public static void main(String[] args) {
    int left = 1;
    int right = 22;

    List<Integer> list = selfDividingNumbers(left, right);
    list.stream().forEach(System.out::println);
  }

  public static List<Integer> selfDividingNumbers(int left, int right) {
    List<Integer> list = new ArrayList<>();

    for (int i = left; i <= right; i++) {
      if (i / 10 == 0) {
        list.add(i);

      } else {
        if (i % 10 == 0) {
          continue;
        } else {
          int n = i;
          boolean is = true;
          while (n > 0) {
            int temp = n % 10;
            if (temp != 0) {
              if (i % temp != 0) {
                is = false;
                break;
              }
              n /= 10;
            } else {
              is = false;
              break;
            }
          }
          if (is) {
            list.add(i);
          }
        }
      }
    }

    return list;
  }
}
