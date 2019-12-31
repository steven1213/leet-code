package com.steven.leetcode.medium;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ThreeSum_15_03Test {

    @Test
    public void threeSum() {
//        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        int[] nums = new int[]{3, 0, -2, -1, 1, 2};
        List<List<Integer>> result = new ThreeSum_15_03().threeSum(nums);
        System.out.println(result);
    }
}