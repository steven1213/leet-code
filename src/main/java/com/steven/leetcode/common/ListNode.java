package com.steven.leetcode.common;

import lombok.extern.slf4j.Slf4j;

/**
 * @author steven
 */
@Slf4j
public class ListNode {
    public int value;

    public ListNode next;

    public ListNode(int x) {
        this.value = x;
        this.next = null;
    }

    public static ListNode initListNode(int[] values) {
        ListNode listNode = new ListNode(0);
        ListNode currentNode = listNode;
        for (int i = 0; i < values.length; i++) {
            currentNode.next = new ListNode(values[i]);
            currentNode = currentNode.next;
        }
        return listNode.next;
    }

    public static void printListNode(ListNode node) {
        StringBuilder sb = new StringBuilder();
        while (node.next != null) {
            sb.append(node.value).append("——>");
            node = node.next;
        }
        sb.append(node.value);
        log.info("The ListNode is :{}", sb.toString());
    }
}
