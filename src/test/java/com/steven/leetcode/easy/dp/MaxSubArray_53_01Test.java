package com.steven.leetcode.easy.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSubArray_53_01Test {

    @Test
    public void maxSubArray() {

        int[] array = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        int[] array = new int[]{-2, 1};
        int result = new MaxSubArray_53_01().maxSubArray(array);
        System.out.println(result);
    }
}