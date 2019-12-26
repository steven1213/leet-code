package com.steven.leetcode.medium;

/**
 * 给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
 * <p>
 * 示例 1:
 * <p>
 * 输入: num1 = "2", num2 = "3"
 * 输出: "6"
 * 示例 2:
 * <p>
 * 输入: num1 = "123", num2 = "456"
 * 输出: "56088"
 * 说明：
 * <p>
 * num1 和 num2 的长度小于110。
 * num1 和 num2 只包含数字 0-9。
 * num1 和 num2 均不以零开头，除非是数字 0 本身。
 * 不能使用任何标准库的大数类型（比如 BigInteger）或直接将输入转换为整数来处理。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/multiply-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author steven
 * @date 2019/12/26
 */
public class Multiply_43_01 {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int len1 = num1.length();
        int len2 = num2.length();
        int len = len1 + len2;
        int[] array = new int[len];
        if (len1 <= len2) {
            multiplyTwoString(num2, num1, array);
        } else {
            multiplyTwoString(num1, num2, array);
        }
        int index = len - 1;
        for (; index >= 0; index--) {
            if (array[index] >= 10) {
                int temp = array[index];
                array[index] = temp % 10;
                array[index - 1] += temp / 10;
            }
        }
        int i = 0;
        StringBuilder sb = new StringBuilder();
        boolean begin = false;
        for (; i < len; i++) {
            if (begin) {
                sb.append(array[i]);
            } else {
                if (array[i] != 0) {
                    sb.append(array[i]);
                    begin = true;
                }
            }
        }
        return sb.toString();
    }

    private void multiplyTwoString(String num1, String num2, int[] array) {
        int len1 = num1.length();
        int len2 = num2.length();
        int len = array.length;
        int i1 = len1 - 1;
        for (; i1 >= 0; i1--) {
            int begin = len - (len1 - i1);
            int numA = num1.charAt(i1) - 48;
            int i2 = len2 - 1;
            for (; i2 >= 0; i2--) {
                int numB = num2.charAt(i2) - 48;
                int value = numA * numB;
                array[begin] += value;
                begin--;
            }
        }
    }

}
