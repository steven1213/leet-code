package com.steven.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-07-13 00:51:58.
 */
public class JudgeCircle {

  public static void main(String[] args) {
    String s = "UD";
    boolean result = judgeCircle1(s);
    System.out.println("result is:" + result);
  }

  public static boolean judgeCircle(String move) {
    int len = move.length();
    if (len % 2 != 0) {
      return false;
    } else {
      int x = 0;
      int y = 0;
      char[] charArray = move.toCharArray();
      for (int i = 0; i < len; i++) {
        if ("u".equalsIgnoreCase(String.valueOf(charArray[i]))) {
          y += 1;
          continue;
        }

        if ("d".equalsIgnoreCase(String.valueOf(charArray[i]))) {
          y += -1;
          continue;
        }

        if ("r".equalsIgnoreCase(String.valueOf(charArray[i]))) {
          x += 1;
          continue;
        }

        if ("l".equalsIgnoreCase(String.valueOf(charArray[i]))) {
          x += -1;
          continue;
        }
      }
      if (x == 0 && y == 0) {
        return true;
      }
      return false;
    }
  }

  public static boolean judgeCircle1(String move) {
    int len = move.length();
    if (len % 2 != 0) {
      return false;
    } else {
      Map<String, Integer> map = new HashMap<>();
      char[] charArray = move.toCharArray();
      for (int i = 0; i < len; i++) {
          String str = String.valueOf(charArray[i]);
          int size = map.get(str)==null?1:map.get(str)+1;
          map.put(str,size);
      }

      if(Objects.equals(map.get("U"), map.get("D")) && Objects.equals(map.get("L"), map.get("R"))){
          return true;
      }
      return false;
    }
  }
}
