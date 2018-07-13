package com.steven.leetcode.easy;

import ch.qos.logback.core.db.dialect.MySQLDialect;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8
 * CreateTime: 2018-07-13 18:12:58.
 */
public class MaxDepth {

    public static void main(String[] args){
        MyTreeNode root =new MyTreeNode(3);
        MyTreeNode left1 = new MyTreeNode(9);
        MyTreeNode right1 = new MyTreeNode(20);
        root.left = left1;
        root.right = right1;

        MyTreeNode left11 = null;
        MyTreeNode left12 = null;
        left1.left = left11;
        left1.right = left12;
        MyTreeNode right11 = new MyTreeNode(15);
        MyTreeNode right12 = new MyTreeNode(7);
        right1.left = right11;
        right1.right = right12;
        int result = maxDepth(root);
        System.out.println("result is:"+result);
    }
    public static int maxDepth(MyTreeNode root) {
        int size = 0;
        if(root!=null){
            size++;
            size = innerMaxDepth(root,size);
        }
        return size;


    }

    private static int innerMaxDepth(MyTreeNode node,int size){
        int leftHeight = size;
        int rightHeight = size;
        if(node.left!=null){
            leftHeight++;
            leftHeight = innerMaxDepth(node.left,leftHeight);
        }
        if(node.right!=null){
            rightHeight++;
            rightHeight = innerMaxDepth(node.right,rightHeight);
        }
        if(leftHeight>rightHeight){
            size = leftHeight;
        }else{
            size = rightHeight;
        }

        return size;
    }
}

class MyTreeNode{
    int val;
    MyTreeNode left;
    MyTreeNode right;
    MyTreeNode(int x){
        val = x;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public MyTreeNode getLeft() {
        return left;
    }

    public void setLeft(MyTreeNode left) {
        this.left = left;
    }

    public MyTreeNode getRight() {
        return right;
    }

    public void setRight(MyTreeNode right) {
        this.right = right;
    }
}
