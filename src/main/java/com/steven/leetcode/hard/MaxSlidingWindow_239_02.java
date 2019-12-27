package com.steven.leetcode.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
 * <p>
 * 返回滑动窗口中的最大值。
 * <p>
 *  
 * <p>
 * 示例:
 * <p>
 * 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
 * 输出: [3,3,5,5,6,7]
 * 解释:
 * <p>
 * 滑动窗口的位置                最大值
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 * 1 [3  -1  -3] 5  3  6  7       3
 * 1  3 [-1  -3  5] 3  6  7       5
 * 1  3  -1 [-3  5  3] 6  7       5
 * 1  3  -1  -3 [5  3  6] 7       6
 * 1  3  -1  -3  5 [3  6  7]      7
 *  
 * <p>
 * 提示：
 * <p>
 * 你可以假设 k 总是有效的，在输入数组不为空的情况下，1 ≤ k ≤ 输入数组的大小。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sliding-window-maximum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author steven
 */
public class MaxSlidingWindow_239_02 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (null == nums || nums.length == 0) {
            return nums;
        }
        int len = nums.length;
        int i = 0;
        int resultLen = len - k + 1;
        int[] result = new int[resultLen];
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (; i <= len - k; i++) {
            if (k == 1) {
                result[index++] = nums[i];
            } else {
                if (i == 0) {
                    int j = i;
                    for (; j < i + k; j++) {
                        if (nums[j] > max) {
                            max = nums[j];
                        }
                    }
                } else {
                    if (max == nums[i - 1]) {
                        max = Integer.MIN_VALUE;
                        int j = i;
                        for (; j < i + k; j++) {
                            if (nums[j] > max) {
                                max = nums[j];
                            }
                        }
                    } else {
                        max = max > nums[i + k - 1] ? max : nums[i + k - 1];
                    }
                }

                result[index++] = max;
            }
        }

        return result;
    }
}
