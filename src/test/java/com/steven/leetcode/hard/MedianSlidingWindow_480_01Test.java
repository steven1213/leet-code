package com.steven.leetcode.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class MedianSlidingWindow_480_01Test {

    @Test
    public void medianSlidingWindow() {
        int[] nums = new int[]{1, 3, -1, -3, 5, 3, 6, 7};
        double[] result = new MedianSlidingWindow_480_01().medianSlidingWindow(nums, 3);
        System.out.println(result);
    }
}