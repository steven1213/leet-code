package com.steven.leetcode.easy;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

import java.util.HashMap;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-10-24 13:32:34.
 */
public class UniqueMorseCodeWords01 {
  public static void main(String[] args) {
    //
  }

  public static int uniqueMorseRepresentations(String[] words) {
    String[] morseCode =
        new String[] {
          ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
          "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
          "-.--", "--.."
        };
    int len = words.length;
    HashMap<String, Integer> map = new HashMap<>();
    for (int i = 0; i < len; i++) {
      String str = words[i];
      char[] arr = str.toCharArray();
      int arrLen = arr.length;
      StringBuilder sb = new StringBuilder();
      for (int j = 0; j < arrLen; j++) {
        String temp = morseCode[arr[j] - 97];
        sb.append(temp);
      }
      map.put(sb.toString(), 0);
    }

    return map.size();
  }
}
