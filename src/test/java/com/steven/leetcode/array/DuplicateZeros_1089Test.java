package com.steven.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description: TODO. @Author: steven. @CreateTime: 2019-06-28 17:50. Copyright © 2019
 * ,www.oneiotworld.com All Rights Reserved.
 */
public class DuplicateZeros_1089Test {
  @Test
  public void duplicateZeros() throws Exception {
    int[] a1 = new int[] {1, 2, 3};
    int[] a2 = new int[] {1, 0, 2, 3, 0, 4, 5, 0};

    new DuplicateZeros_1089_02().duplicateZeros(a2);
  }
}
