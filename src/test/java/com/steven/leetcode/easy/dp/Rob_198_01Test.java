package com.steven.leetcode.easy.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class Rob_198_01Test {

    @Test
    public void rob() {

        int[] nums1 = new int[]{1, 2, 3, 1};
        int[] nums2 = new int[]{2, 7, 9, 3, 1};
        assertEquals(4, new Rob_198_01().rob(nums1));
        assertEquals(12, new Rob_198_01().rob(nums2));
    }
}