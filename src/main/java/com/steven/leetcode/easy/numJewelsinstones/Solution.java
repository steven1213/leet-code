package com.steven.leetcode.easy.numJewelsinstones;

import java.util.HashSet;
import java.util.Set;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-07-12 23:06:24.
 */
public class Solution {

  public static void main(String[] args) {
    String J = "aA";
    String S = "aAAbbbb";

    int size = numJewelsInStones(J, S);
    System.out.println("size is:" + size);
  }

  public static int numJewelsInStones(String J, String S) {
    int count = 0;
    Set<String> tempSet = new HashSet<>();
    char[] charArray = J.toCharArray();
    int len = charArray.length;
    for (int i = 0; i < len; i++) {
      tempSet.add(String.valueOf(charArray[i]));
    }

    if (null != S) {
      int length = S.toCharArray().length;
      for (int j = 0; j < length; j++) {
        if (tempSet.contains(String.valueOf(S.charAt(j)))) {
          count++;
        }
      }
    }

    return count;
  }
}
