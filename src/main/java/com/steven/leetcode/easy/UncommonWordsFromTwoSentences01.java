package com.steven.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved. @Description:
 *
 * @author: steven. @Date: 2018/11/1 11:16.
 */
public class UncommonWordsFromTwoSentences01 {

  public static void main(String[] args) {
    String A = "this apple is sweet";
    String B = "this apple is sour";
  }

  private static String[] uncommonFromSentences(String A, String B) {
    if (null == A && null == B) {
      return null;
    }
    String[] strArrA = A.split(" ");
    String[] strArrB = B.split(" ");

    List<String> listA = new ArrayList<>();
    List<String> listB = new ArrayList<>();
    List<String> common = new ArrayList<>();
    for (String str : strArrA) {
      if(listA.contains(str)){
        common.add(str);
      }else{
        listA.add(str);
      }
    }
    for (String str : strArrB) {
      if(listB.contains(str)){
        common.add(str);
      }else{
        listB.add(str);
      }
    }



    for (String str : listA) {
      if (listB.contains(str)) {
        common.add(str);
      }
    }
    listA.removeAll(common);
    listB.removeAll(common);
    listA.addAll(listB);

    int size = listA.size();
    String[] result = new String[size];
    for (int i = 0; i < size; i++) {
      result[i] = listA.get(i);
    }

    return result;
  }
}
