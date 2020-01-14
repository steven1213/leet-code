package com.steven.leetcode.easy.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxProfit_121_01Test {

    @Test
    public void maxProfit() {
//        int[] prices = new int[]{7,1,5,3,6,4};
        int[] prices = new int[]{7,6,4,3,1};
//        int[] prices = new int[]{2,4,1};
//        int[] prices = new int[]{2, 1, 2, 0, 1};
        System.out.println(new MaxProfit_121_01().maxProfit(prices));
    }
}