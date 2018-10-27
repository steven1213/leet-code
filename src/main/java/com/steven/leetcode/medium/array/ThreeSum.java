package com.steven.leetcode.medium.array;

import java.util.*;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-07-27 16:19:28.
 */
public class ThreeSum {
  public static void main(String[] args) {
    //
    int[] nums = new int[] {-1, 0, 1, 2, -1, -4};
    List<List<Integer>> result = threeSum(nums);
    Iterator iterator = result.iterator();
    while (iterator.hasNext()) {
      List<Integer> tempResult = (List<Integer>) iterator.next();
      Iterator tempIterator = tempResult.iterator();
      StringBuilder sb = new StringBuilder();
      while (tempIterator.hasNext()) {
        sb.append(tempIterator.next()).append(",");
      }
      System.out.println(sb.toString());
    }
  }

  public static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    int len = nums.length;
    if (len < 3) {
      return list;
    }
    Map<Integer, Integer> subMap = new HashMap<>();

    for (int i = 0; i < len; i++) {
      subMap.put(0 - nums[i], i);
    }
    for (int i = 0; i < len - 1; i++) {
      int a = nums[i];
      for (int j = i+1; j < len; j++) {
        int b = nums[j];
        int total = a + b;
        if (subMap.containsKey(total)) {
          int index = subMap.get(total);
          if (index == i || index == j) {
            continue;
          } else {
            Integer[] temp = new Integer[] {nums[index], nums[i], nums[j]};
            Arrays.sort(temp);
            List<Integer> midAList = Arrays.asList(temp);
            if (!list.contains(midAList)) {
              list.add(midAList);
            }
          }
        }
      }
    }
    return list;
  }
}
