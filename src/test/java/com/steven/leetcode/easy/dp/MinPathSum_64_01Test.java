package com.steven.leetcode.easy.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinPathSum_64_01Test {

    @Test
    public void minPathSum() {
        int[][] grid = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};

        int result = new MinPathSum_64_01().minPathSum(grid);
        assertEquals(7, result);
    }
}