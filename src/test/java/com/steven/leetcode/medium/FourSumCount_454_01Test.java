package com.steven.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 四个总和数45401测试
 * <p>
 * <p>
 * A = [ 1, 2]
 * * B = [-2,-1]
 * * C = [-1, 2]
 * * D = [ 0, 2]
 *
 * @author steven
 * @date 2019/12/23
 */
public class FourSumCount_454_01Test {

    @Test
    public void fourSumCount() {

        int[] A = new int[]{1, 2};
        int[] B = new int[]{-2, -1};
        int[] C = new int[]{-1, 2};
        int[] D = new int[]{0, 2};
        int result = new FourSumCount_454_01().fourSumCount(A, B, C, D);
        assertTrue(2 == result);
    }
}