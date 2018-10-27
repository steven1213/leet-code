package com.steven.leetcode.easy;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-10-24 12:56:05.
 */
public class JewelsAndStones01 {
  public static void main(String[] args) {
    String J = "aA";
    String S = "aAAbbbb";
    int result = numJewelsInStones(J, S);
    System.out.println("result is:" + result);
  }

  public static int numJewelsInStones(String J, String S) {
    int count = 0;

    if(null == S){
        return count;
    }
    HashMap<Character, Integer> table = new HashMap();
    char[] chars = S.toCharArray();
    int sLen = chars.length;
    for (int i = 0; i < sLen; i++) {
      char temp = chars[i];
      if (table.containsKey(temp)) {
        table.put(temp, table.get(temp) + 1);
      } else {
        table.put(temp, 1);
      }
    }

    char[] charj = J.toCharArray();
    int jLen = charj.length;
    for (int i = 0; i < jLen; i++) {
      char temp = charj[i];
      if (table.containsKey(temp)) {
        count += table.get(temp);
      }
    }

    return count;
  }
}
