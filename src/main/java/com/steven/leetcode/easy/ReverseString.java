package com.steven.leetcode.easy;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-07-18 10:39:54.
 */
public class ReverseString {
  public static void main(String[] args) {
    //
    String s = "hello";
    String result = reverseString(s);
    System.out.println("result is:" + result);
  }

  public static String reverseString(String s) {

      char[] charArray = s.toCharArray();
      int i=0;
      int j=charArray.length-1;
      while(i<j){
         char temp = charArray[i];
         charArray[i]=charArray[j];
         charArray[j]=temp;
         i++;
         j--;
      }
      return new String(charArray);
  }
}
