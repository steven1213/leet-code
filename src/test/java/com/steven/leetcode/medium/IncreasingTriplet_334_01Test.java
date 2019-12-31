package com.steven.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class IncreasingTriplet_334_01Test {

    @Test
    public void increasingTriplet() {
//        int[] nums1 = new int[]{1, 2, 3, 4, 5};
        int[] nums2 = new int[]{0, 4, 2, 1, 0, -1, -3};
//
//        assertTrue(new IncreasingTriplet_334_01().increasingTriplet(nums1));
        assertTrue(!new IncreasingTriplet_334_01().increasingTriplet(nums2));
    }
}