package com.steven.leetcode.array;

/**
 * @Description: TODO. @Author: steven. @CreateTime: 2019-06-28 17:24. Copyright © 2019
 * ,www.oneiotworld.com All Rights Reserved.
 */
public class PlusOne_66 {

  public int[] plusOne(int[] digits) {
    int pre = 0;
    int len = digits.length;
    int plusAfter = digits[len - 1] + 1 + pre;
    if (plusAfter < 10) {
      digits[len - 1] = plusAfter;
    } else {
      digits[len - 1] = plusAfter - 10;
      pre = plusAfter / 10;
      for (int i = len - 2; i >= 0; i--) {
        plusAfter = digits[i] + pre;
        if (plusAfter >= 10) {
          digits[i] = plusAfter - 10;
          pre = plusAfter / 10;
        } else {
          digits[i] = plusAfter;
          pre = 0;
          break;
        }
      }
      if (pre != 0) {
        int[] array = new int[len + 1];
        array[0] = pre;
        for (int i = 0; i < len; i++) {
          array[i + 1] = digits[i];
        }
        return array;
      }
    }

    return digits;
  }
}
