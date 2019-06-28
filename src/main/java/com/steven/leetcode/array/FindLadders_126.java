package com.steven.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO. @Author: steven. @CreateTime: 2019-06-28 16:21. Copyright © 2019
 * ,www.oneiotworld.com All Rights Reserved.
 */
public class FindLadders_126 {

  public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
    if (!wordList.contains(beginWord)) {
      return new ArrayList<>();
    }
    if (!wordList.contains(endWord)) {
      return new ArrayList<>();
    }

    List<List<String>> list = new ArrayList<>();




    return list;
  }
}
