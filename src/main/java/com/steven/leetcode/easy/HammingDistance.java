package com.steven.leetcode.easy;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8
 * CreateTime: 2018-07-12 23:55:59.
 */
public class HammingDistance{
  public static void main(String[] args) {
    int x = 1;
    int y = 4;
    int result = hammingDistance(x,y);
    System.out.println(result);
  }

  public static int hammingDistance(int x,int y){
      int z = x^y;
      int count = 0;
      for(int i=0;i<32;i++){
        count += (z>>>(31-i)&1);
      }
      return count;
  }
}
