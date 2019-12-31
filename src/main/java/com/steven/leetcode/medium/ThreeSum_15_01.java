package com.steven.leetcode.medium;

import java.util.*;

/**
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 * <p>
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * <p>
 * 满足要求的三元组集合为：
 * [
 * [-1, 0, 1],
 * [-1, -1, 2]
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author steven.  时间复杂度高，不通过
 * @since JDK 1.8 CreateTime: 2018-07-27 16:19:28.
 */
public class ThreeSum_15_01 {
    public static void main(String[] args) {
        //
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(nums);
        Iterator iterator = result.iterator();
        while (iterator.hasNext()) {
            List<Integer> tempResult = (List<Integer>) iterator.next();
            Iterator tempIterator = tempResult.iterator();
            StringBuilder sb = new StringBuilder();
            while (tempIterator.hasNext()) {
                sb.append(tempIterator.next()).append(",");
            }
            System.out.println(sb.toString());
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int len = nums.length;
        if (len < 3) {
            return list;
        }
        Map<Integer, Integer> subMap = new HashMap<>();

        for (int i = 0; i < len; i++) {
            subMap.put(0 - nums[i], i);
        }
        for (int i = 0; i < len - 1; i++) {
            int a = nums[i];
            for (int j = i + 1; j < len; j++) {
                int b = nums[j];
                int total = a + b;
                if (subMap.containsKey(total)) {
                    int index = subMap.get(total);
                    if (index == i || index == j) {
                        continue;
                    } else {
                        Integer[] temp = new Integer[]{nums[index], nums[i], nums[j]};
                        Arrays.sort(temp);
                        List<Integer> midAList = Arrays.asList(temp);
                        if (!list.contains(midAList)) {
                            list.add(midAList);
                        }
                    }
                }
            }
        }
        return list;
    }
}
