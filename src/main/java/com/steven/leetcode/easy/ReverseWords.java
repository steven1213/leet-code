package com.steven.leetcode.easy;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-07-18 10:48:33.
 */
public class ReverseWords {
  public static void main(String[] args) {

    String s = "Let's take LeetCode contest";
    String result = reverseWords(s);
    System.out.println("result is:" + result);
  }

  public static String reverseWords(String s) {
    if (null == s || s.length() == 0) {
      return s;
    }
    String[] strArray = s.split(" ");
    int len = strArray.length;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < len - 1; i++) {
      sb.append(reverseString(strArray[i])).append(" ");
    }
    sb.append(reverseString(strArray[len - 1]));
    return sb.toString();
  }

  public static String reverseString(String s) {

    char[] charArray = s.toCharArray();
    int i = 0;
    int j = charArray.length - 1;
    while (i < j) {
      char temp = charArray[i];
      charArray[i] = charArray[j];
      charArray[j] = temp;
      i++;
      j--;
    }
    return new String(charArray);
  }
}
