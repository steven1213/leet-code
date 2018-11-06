package com.steven.leetcode;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved. @Description:
 *
 * @author: steven. @Date: 2018/11/1 10:38.
 */
public class TwoListDiffTest {
  public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    list1.add(1);
    list1.add(2);
    list1.add(3);
    list1.add(5);
    list1.add(6);
    list1.add(7);

    list2.add(2);
    list2.add(3);
    list2.add(4);
    list2.add(6);
    list2.add(8);

    // 1,5,4,7,8
    List<Integer> result = diff(list1, list2);
  }

  private static List<Integer> diff(List<Integer> list1, List<Integer> list2) {
    if (list1 == null && list2 == null) {
      return null;
    }
    if (list1 == null && list2 != null) {
      return list2;
    }
    if (list2 == null && list1 != null) {
      return list1;
    }

    List<Integer> common = new ArrayList<>();

    for (Integer temp : list1) {
      if (list2.contains(temp)) {
        common.add(temp);
      }
    }
    list1.removeAll(common);
    list2.removeAll(common);
    list1.addAll(list2);
    return list1;
  }
}
