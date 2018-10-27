package com.steven.leetcode.mytest;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-10-23 21:43:31.
 */
public class FirstCommonNodeList {

  @Getter
  @Setter
  static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
    }
  }

  public static void main(String[] args) {

    Node nodeRoot1 = new Node(1);

    Node nodeRoot2 = new Node(1);

    Node node11 = new Node(11);
    Node node12 = new Node(12);
    Node node13 = new Node(13);
    Node node14 = new Node(14);
    Node node15 = new Node(15);
    Node node16 = new Node(16);

    nodeRoot1.next = node11;
    node11.next = node12;
    node12.next = node13;
    node13.next = node14;
    node14.next = node15;
    node15.next = node16;

    Node node21 = new Node(21);
    Node node22 = new Node(22);
    Node node23 = new Node(23);
    Node node24 = new Node(24);

    nodeRoot2.next = node21;
    node21.next = node22;
    node22.next = node23;
    node23.next = node24;
    node24.next = node14;

    Node find = getFirstCommonNode(nodeRoot1, nodeRoot2);
    System.out.println("result is:" + find.data);
  }

  private static Node getFirstCommonNode(Node nodeRoot1, Node nodeRoot2) {
    if (nodeRoot1 == nodeRoot2) {
      return nodeRoot1;
    }

    int l1 = getLen(nodeRoot1);
    int l2 = getLen(nodeRoot2);

    if (l1 > l2) {
      for (int i = 0; i < (l1 - l2); i++) {
        nodeRoot1 = nodeRoot1.next;
      }
    } else {
      for (int i = 0; i < (l1 - l2); i++) {
        nodeRoot2 = nodeRoot2.next;
      }
    }
    boolean f = true;

    Node p = null;
    if (f) {
      if (nodeRoot1 == null || nodeRoot2 == null) {
        return null;
      }
      if (nodeRoot1 == nodeRoot2) {
        p = nodeRoot1;
        f = false;
      } else {
        nodeRoot1 = nodeRoot1.next;
        nodeRoot2 = nodeRoot2.next;
      }
    }
    return p;
  }

  private static int getLen(Node nodeRoot1) {
    int len = 0;
    Node currentNode = nodeRoot1;
    while (currentNode != null) {
      len++;
      currentNode = nodeRoot1.next;
    }
    return len;
  }
}
