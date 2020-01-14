package com.steven.leetcode.easy.dp;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），
 * 返回其最大和。
 * <p>
 * 示例:
 * <p>
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-subarray
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MaxSubArray_53_01 {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        int max = Integer.MIN_VALUE;
        int subLen = len;
        while (subLen > 0) {
            max = calcSubArray(nums, len, subLen, max);
            subLen--;
        }
        return max;
    }

    public int calcSubArray(int[] array, int len, int subLen, int max) {
        int i = 0;
        int subSum = 0;
        int index = i;
        int maxIndex = len - (subLen - 1);
        for (; i < maxIndex; i++) {
            if (index == i) {
                int j = i;
                int tempLen = i + subLen;
                for (; j < tempLen; j++) {
                    subSum += array[j];
                }
            } else {
                subSum = subSum - array[i - 1] + array[i + subLen - 1];
            }
            max = Math.max(max, subSum);
        }
        return max;
    }
}
