package com.steven.leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Multiply_43_01Test {

    @Test
    public void multiply() {
        String num1 = "123";
        String num2 = "456";
        String result = new Multiply_43_01().multiply(num1, num2);
        assertTrue(result.equals("56088"));
    }
}