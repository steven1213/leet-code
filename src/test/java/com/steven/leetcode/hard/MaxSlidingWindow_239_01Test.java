package com.steven.leetcode.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSlidingWindow_239_01Test {

    @Test
    public void maxSlidingWindow() {
        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        int[] result = new MaxSlidingWindow_239_01().maxSlidingWindow(nums, 3);
        System.out.println(result);
    }
}