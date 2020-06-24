package com.steven.tag.stack.easy;

import java.util.HashMap;
import java.util.Stack;

/**
 * //给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * //
 * // 有效字符串需满足：
 * //
 * //
 * // 左括号必须用相同类型的右括号闭合。
 * // 左括号必须以正确的顺序闭合。
 * //
 * //
 * // 注意空字符串可被认为是有效字符串。
 * //
 * // 示例 1:
 * //
 * // 输入: "()"
 * //输出: true
 * //
 * //
 * // 示例 2:
 * //
 * // 输入: "()[]{}"
 * //输出: true
 * //
 * //
 * // 示例 3:
 * //
 * // 输入: "(]"
 * //输出: false
 * //
 * //
 * // 示例 4:
 * //
 * // 输入: "([)]"
 * //输出: false
 * //
 * //
 * // 示例 5:
 * //
 * // 输入: "{[]}"
 * //输出: true
 * // Related Topics 栈 字符串
 *
 * @author steven
 */
public class IsValid_lc_20 {

    public boolean isValid(String s) {
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put(')', '(');
        hashMap.put('}', '{');
        hashMap.put(']', '[');

        if (null == s) {
            return true;
        }
        int size = s.length();
        if (size % 2 == 1) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                if (0 < stack.size() && stack.peek().equals(hashMap.get(s.charAt(i)))) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
