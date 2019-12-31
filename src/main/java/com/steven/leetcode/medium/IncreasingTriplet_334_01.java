package com.steven.leetcode.medium;

import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 给定一个未排序的数组，判断这个数组中是否存在长度为 3 的递增子序列。
 * <p>
 * 数学表达式如下:
 * <p>
 * 如果存在这样的 i, j, k,  且满足 0 ≤ i < j < k ≤ n-1，
 * 使得 arr[i] < arr[j] < arr[k] ，返回 true ; 否则返回 false 。
 * 说明: 要求算法的时间复杂度为 O(n)，空间复杂度为 O(1) 。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3,4,5]
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: [5,4,3,2,1]
 * 输出: false
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/increasing-triplet-subsequence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author steven
 * @date 2019/12/31
 */
public class IncreasingTriplet_334_01 {
    public boolean increasingTriplet(int[] nums) {
        int len = nums.length;
        for (int i = 0; i <= len - 3; i++) {
            int a = nums[i];
            for (int j = i + 1; j <= len - 2; j++) {
                int b = nums[j];
                for (int k = j + 1; k <= len - 1; k++) {
                    int c = nums[k];
                    if (a < b && b < c) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
