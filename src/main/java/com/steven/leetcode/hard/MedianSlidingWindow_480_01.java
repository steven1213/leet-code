package com.steven.leetcode.hard;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 中位数是有序序列最中间的那个数。如果序列的大小是偶数，则没有最中间的数；此时中位数是最中间的两个数的平均数。
 * <p>
 * 例如：
 * <p>
 * [2,3,4]，中位数是 3
 * <p>
 * [2,3]，中位数是 (2 + 3) / 2 = 2.5
 * <p>
 * 给出一个数组 nums，有一个大小为 k 的窗口从最左端滑动到最右端。窗口中有 k 个数，每次窗口移动 1 位。你的任务是找出每次窗口移动后得到的新窗口中元素的中位数，并输出由它们组成的数组。
 * <p>
 * 例如：
 * <p>
 * 给出 nums = [1,3,-1,-3,5,3,6,7]，以及 k = 3。
 * <p>
 * 窗口位置                      中位数
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       1
 * 1 [3  -1  -3] 5  3  6  7       -1
 * 1  3 [-1  -3  5] 3  6  7       -1
 * 1  3  -1 [-3  5  3] 6  7       3
 * 1  3  -1  -3 [5  3  6] 7       5
 * 1  3  -1  -3  5 [3  6  7]      6
 *  因此，返回该滑动窗口的中位数数组 [1,-1,-1,3,5,6]。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sliding-window-median
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author steven
 */
public class MedianSlidingWindow_480_01 {
    public double[] medianSlidingWindow(int[] nums, int k) {
        if (null == nums || nums.length == 0) {
            return new double[0];
        }
        List<Double> list = new ArrayList<>();
        int len = nums.length;
        int resultLen = len - k + 1;
        double[] result = new double[resultLen];
        int resultIndex = 0;
        int i = 0;
        int mode = k % 2;
        for (; i <= len - k; i++) {
            if (k == 1) {
                result[resultIndex++] = nums[i];
            } else {
                if (i == 0) {
                    int j = i;
                    for (; j < k; j++) {
                        list.add((double) nums[j]);
                    }
                } else {
                    list.add((double) nums[i + k - 1]);
                }
                list = list.stream().sorted().collect(Collectors.toList());
                if (mode == 0) {
                    result[resultIndex++] = (list.get(k / 2 - 1) + list.get(k / 2)) / 2;
                } else {
                    result[resultIndex++] = list.get(k / 2);

                }
                list.remove((double)nums[i]);
            }
        }

        return result;
    }
}
