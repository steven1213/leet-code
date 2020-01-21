package com.steven.leetcode.medium.dp;

import org.junit.Test;

public class CountBits_338_01Test {

    @Test
    public void countBits() {
        int a = 2;
        int b = 8;
        int[] anums = new int[]{0, 1, 1};
        int[] bnums = new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1};

        int[] aResult = new CountBits_338_01().countBits(a);
        int[] bResult = new CountBits_338_01().countBits(b);

        assertFalse(anums, aResult);
        assertFalse(bnums, bResult);

    }

    private void assertFalse(int[] anums, int[] aResult) {
    }
}