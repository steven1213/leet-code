package com.steven.leetcode.easy;

import java.util.*;
import java.util.stream.Stream;

/**
 * Copyright © 2018 ,www.oneiotworld.com All Rights Reserved.
 *
 * @author steven.
 * @since JDK 1.8 CreateTime: 2018-08-12 10:13:53.
 */
public class FindString {
  public static void main(String[] args) {
     String[] words = new String[]{"Hello", "Alaska", "Dad", "Peace"};
     String[] result = findWords1(words);
     List<String> lists = Arrays.asList(result);
     Stream.of(lists).forEach(System.out::println);

  }

  public static String[] findWords(String[] words) {
    List<String> listWords = new ArrayList<>();
    Map<String, Integer> rowMap = initMap();
    Stream.of(words)
        .forEach(
            word -> {
              int length = word.length();

              int line = rowMap.get(String.valueOf(word.charAt(0)));
              boolean oneLine = true;
              for (int i = 1; i < length; i++) {
                if (rowMap.get(String.valueOf(word.charAt(i))) != line) {
                  oneLine = false;
                  break;
                }
              }
              if (oneLine) {
                listWords.add(word);
              }
            });
    String[] result = new String[listWords.size()];
    return listWords.toArray(result);
  }

  public static String[] findWords1(String[] words) {
    int[] array = initArray();
    List<String> list = new ArrayList<>();
    Stream.of(words).parallel()
        .forEach(
            word -> {
              int tmp = array[word.charAt(0) - 'A'];
              boolean flag = true;
              for (char c : word.toCharArray()) {
                  if(tmp!=array[c-'A']){
                      flag = false;
                      break;
                  }
              }
              if(flag){
                  list.add(word);
              }
            });
    return list.toArray(new String[list.size()]);
  }

  public static Map<String, Integer> initMap() {
    Map<String, Integer> rowMap = new HashMap<String, Integer>(64);
    rowMap.put("Q", 1);
    rowMap.put("q", 1);
    rowMap.put("w", 1);
    rowMap.put("W", 1);
    rowMap.put("E", 1);
    rowMap.put("e", 1);
    rowMap.put("R", 1);
    rowMap.put("r", 1);
    rowMap.put("T", 1);
    rowMap.put("t", 1);
    rowMap.put("Y", 1);
    rowMap.put("y", 1);
    rowMap.put("U", 1);
    rowMap.put("u", 1);
    rowMap.put("I", 1);
    rowMap.put("i", 1);
    rowMap.put("O", 1);
    rowMap.put("o", 1);
    rowMap.put("p", 1);
    rowMap.put("P", 1);

    rowMap.put("A", 2);
    rowMap.put("a", 2);
    rowMap.put("S", 2);
    rowMap.put("s", 2);
    rowMap.put("D", 2);
    rowMap.put("d", 2);
    rowMap.put("F", 2);
    rowMap.put("f", 2);
    rowMap.put("G", 2);
    rowMap.put("g", 2);
    rowMap.put("H", 2);
    rowMap.put("h", 2);
    rowMap.put("J", 2);
    rowMap.put("j", 2);
    rowMap.put("K", 2);
    rowMap.put("k", 2);
    rowMap.put("L", 2);
    rowMap.put("l", 2);

    rowMap.put("Z", 3);
    rowMap.put("z", 3);
    rowMap.put("X", 3);
    rowMap.put("x", 3);
    rowMap.put("V", 3);
    rowMap.put("v", 3);
    rowMap.put("C", 3);
    rowMap.put("c", 3);
    rowMap.put("B", 3);
    rowMap.put("b", 3);
    rowMap.put("N", 3);
    rowMap.put("n", 3);
    rowMap.put("M", 3);
    rowMap.put("m", 3);

    return rowMap;
  }

  public static int[] initArray() {
    int[] array =
        new int[] {
          1, 2, 2, 1, 0, 1, 1, 1, 0, 1, 1, 1, 2, 2, 0, 0, 0, 0, 1, 0, 0, 2, 0, 2, 0, 2, 4, 4, 4, 4,
          4, 4, 1, 2, 2, 1, 0, 1, 1, 1, 0, 1, 1, 1, 2, 2, 0, 0, 0, 0, 1, 0, 0, 2, 0, 2, 0, 2
        };
    return array;
  }
}
