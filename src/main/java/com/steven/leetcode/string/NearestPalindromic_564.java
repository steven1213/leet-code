package com.steven.leetcode.string;

/**
 * @Description: TODO. @Author: steven. @CreateTime: 2019-07-01 13:51. Copyright © 2019
 * ,www.oneiotworld.com All Rights Reserved.
 */
public class NearestPalindromic_564 {
  public String nearestPalindromic(String n) {

    int len = n.length();
    if (len == 1) {
      return String.valueOf(Integer.valueOf(n) - 1);
    }
    int mid = (len - 1) / 2;
    if (Integer.valueOf(n.charAt(mid)).equals(0)) {

    } else {

    }

    return null;
  }
}
