package com.steven.leetcode.easy;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.BEncoderStream;
import sun.security.util.Length;

import java.lang.annotation.Target;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved. @Description:
 *
 * @author: steven. @Date: 2018/11/1 16:41.
 */
public class SearchInsertPosition01 {
  public static void main(String[] args) {
    int[] arr = new int[] {1, 3, 5, 6};
    int target = 5;
    int result = searchInsert(arr, target);
    System.out.println("result is :" + result);
  }

  private static int searchInsert(int[] nums, int target) {
    int len = nums.length;
    if (nums[0] > target) {
      return 0;
    }
    if (nums[len - 1] < target) {
      return len;
    }
    int index = halfSearch(nums, 0, len / 2, target);
    if (index != -1) {
      index = halfSearch(nums, len / 2 + 1, len, target);
    }
    return index;
  }

  private static int halfSearch(int[] nums, int begin, int end, int target) {
    int index = -1;
    if (begin < end) {
      if (target < nums[begin]) {
        if (begin == 0) {
          return 0;
        }
      }

      if (target > nums[end - 1]) {
        if (end == nums.length) {
          return nums.length;
        }
      }
      index = halfSearch(nums, begin, begin + (end - begin) / 2, target);
      if (index == -1) {
        index = halfSearch(nums, begin + (end - begin) / 2, end, target);
      }
      return index;
    } else {
      return index;
    }
  }
}
