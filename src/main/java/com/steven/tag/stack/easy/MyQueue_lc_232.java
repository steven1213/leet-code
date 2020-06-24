package com.steven.tag.stack.easy;

//使用栈实现队列的下列操作：
//
//
// push(x) -- 将一个元素放入队列的尾部。
// pop() -- 从队列首部移除元素。
// peek() -- 返回队列首部的元素。
// empty() -- 返回队列是否为空。
//
//
//
//
// 示例:
//
// MyQueue queue = new MyQueue();
//
//queue.push(1);
//queue.push(2);
//queue.peek();  // 返回 1
//queue.pop();   // 返回 1
//queue.empty(); // 返回 false
//
//
//
// 说明:
//
//
// 你只能使用标准的栈操作 -- 也就是只有 push to top, peek/pop from top, size, 和 is empty 操作是合法的。
//
// 你所使用的语言也许不支持栈。你可以使用 list 或者 deque（双端队列）来模拟一个栈，只要是标准的栈操作即可。
// 假设所有操作都是有效的 （例如，一个空的队列不会调用 pop 或者 peek 操作）。
//
// Related Topics 栈 设计

import java.util.Stack;

public class MyQueue_lc_232 {

    private static Stack<Integer> stack;
    private static Stack<Integer> reservalStack;

    /**
     * Initialize your data structure here.
     */
    public MyQueue_lc_232() {
        stack = new Stack<>();
        reservalStack = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        stack.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (empty()) {
            return 0;
        }
        int size = stack.size();
        for (int i = size - 1; i > 0; i--) {
            reservalStack.push(stack.pop());
        }

        int val = stack.pop();
        size = reservalStack.size();
        for (int i = 0; i < size; i++) {
            stack.push(reservalStack.pop());
        }

        return val;
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (empty()) {
            return 0;
        }
        int size = stack.size();
        for (int i = size - 1; i > 0; i--) {
            reservalStack.push(stack.pop());
        }

        int val = stack.pop();
        size = reservalStack.size();
        for (int i = 0; i < size; i++) {
            stack.push(reservalStack.pop());
        }

        return val;
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return stack.isEmpty();
    }
}
