package com.steven.tag.stack.easy;

import java.util.Stack;
import java.util.TreeMap;

/**
 * //设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 * //
 * //
 * // push(x) —— 将元素 x 推入栈中。
 * // pop() —— 删除栈顶的元素。
 * // top() —— 获取栈顶元素。
 * // getMin() —— 检索栈中的最小元素。
 * //
 * //
 * //
 * //
 * // 示例:
 * //
 * // 输入：
 * //["MinStack","push","push","push","getMin","pop","top","getMin"]
 * //[[],[-2],[0],[-3],[],[],[],[]]
 * //
 * //输出：
 * //[null,null,null,null,-3,null,0,-2]
 * //
 * //解释：
 * //MinStack minStack = new MinStack();
 * //minStack.push(-2);
 * //minStack.push(0);
 * //minStack.push(-3);
 * //minStack.getMin();   --> 返回 -3.
 * //minStack.pop();
 * //minStack.top();      --> 返回 0.
 * //minStack.getMin();   --> 返回 -2.
 * //
 * //
 * //
 * //
 * // 提示：
 * //
 * //
 * // pop、top 和 getMin 操作总是在 非空栈 上调用。
 * //
 * // Related Topics 栈 设计
 */
public class MinStack_lc_155 {

    private static Stack<Integer> stack = null;
    private static TreeMap<Integer, Integer> treeMap = null;

    /**
     * initialize your data structure here.
     */
    public MinStack_lc_155() {
        treeMap = new TreeMap<>();
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        treeMap.put(x, treeMap.get(x) == null ? 1 : treeMap.get(x) + 1);

    }

    public void pop() {
        int value = stack.peek();
        stack.pop();
        if (treeMap.get(value) > 1) {
            treeMap.put(value, treeMap.get(value) - 1);
        } else {
            treeMap.remove(value);
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return treeMap.keySet().iterator().next();
    }
}
