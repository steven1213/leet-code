package com.steven.leetcode.medium;

import sun.print.SunMinMaxPage;

import java.util.*;
import java.util.stream.Collectors;

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
 *  超时
 * @author steven.
 */
public class ThreeSum_15_02 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int len = nums.length;
        int i = 0;
        Map<Integer, Integer> sumResult = new HashMap<>();
        for (; i < len; i++) {
            sumResult.put(-nums[i], i);
        }
        i = 0;
        for (; i < len - 1; i++) {
            int a = nums[i];
            int j = 1;
            for (; j < len; j++) {
                int b = nums[j];
                int sum = a + b;
                if (sumResult.containsKey(sum)) {
                    int index = sumResult.get(sum);
                    if (i != j && i != index && j != index) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(a);
                        temp.add(b);
                        temp.add(-(a + b));
                        temp = temp.stream().sorted().collect(Collectors.toList());
                        if (!list.contains(temp)) {
                            list.add(temp);
                        }
                    }
                }
            }
        }
        return list;
    }
}
