package com.steven.leetcode.medium;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 * * <p>
 * * 注意：答案中不可以包含重复的三元组。
 * * <p>
 * * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * * <p>
 * * 满足要求的三元组集合为：
 * * [
 * * [-1, 0, 1],
 * * [-1, -1, 2]
 * * ]
 * * <p>
 * * 来源：力扣（LeetCode）
 * * 链接：https://leetcode-cn.com/problems/3sum
 * * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 超时
 *
 * @author steven.
 */
public class ThreeSum_15_03 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if (null == nums || nums.length < 3) {
            return list;
        }
        Arrays.sort(nums);
        int len = nums.length;
        int index = 0;
        for (; index < len; index++) {
            if (nums[index] > 0) {
                return list;
            }
            if (index > 0 && nums[index] == nums[index - 1]) {
                continue;
            }
            int L = index + 1;
            int R = len - 1;
            while (L < R) {
                int sum = nums[index] + nums[L] + nums[R];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[index], nums[L], nums[R]));
                    while (L < R && nums[L] == nums[L + 1]) {
                        L++; // 去重
                    }
                    while (L < R && nums[R] == nums[R - 1]) {
                        R--; // 去重
                    }
                    L++;
                    R--;
                } else if (sum < 0) {
                    L++;
                } else if (sum > 0) {
                    R--;
                }
            }
        }
        return list;
    }
}
