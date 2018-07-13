package com.steven.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-07-13 17:16:08.
 */
public class UniqueMorseRepresentations {
  public static void main(String[] args) {
    //
    String[] str = new String[] {"gin", "zen", "gig", "msg"};
    int result = uniqueMorseRepresentations(str);
    System.out.println("result is:" + result);
  }

  public static int uniqueMorseRepresentations(String[] str) {
    String[] a =
        new String[] {
          ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
          "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
          "-.--", "--.."
        };
    Set<String> set = new HashSet<>();
    int len = str.length;
    for (int i = 0; i < len; i++) {
      StringBuffer sb = new StringBuffer();
      String temp = str[i];
      int length = temp.length();
      for (int j = 0; j < length; j++) {
        char c = temp.charAt(j);
        int index = c - 97;
        sb.append(a[index]);
      }
      set.add(sb.toString());
    }
    return set.size();
  }
}
