package com.steven.leetcode.array;

import com.sun.deploy.util.StringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO. @Author: steven. @CreateTime: 2019-06-28 16:23. Copyright © 2019
 * ,www.oneiotworld.com All Rights Reserved.
 */
public class FindLadders_126Test {

  private String beginWord;

  private String endWord;

  private List<String> wordList;

  @Test
  public void findLadders() throws Exception {
    //caseOne();
    caseTwo();
    List<List<String>> result = new FindLadders_126().findLadders(beginWord, endWord, wordList);
    System.out.println(StringUtils.join(result, ","));
  }

  private void caseOne() {
    beginWord = "hit";
    endWord = "cog";
    wordList = new ArrayList<>();
    wordList.add("hot");
    wordList.add("dot");
    wordList.add("dog");
    wordList.add("lot");
    wordList.add("log");
    wordList.add("cog");
  }

  private void caseTwo() {
    beginWord = "hit";
    endWord = "cog";
    wordList = new ArrayList<>();
    wordList.add("hot");
    wordList.add("dot");
    wordList.add("dog");
    wordList.add("lot");
    wordList.add("log");
  }
}
