package com.panpawelw.dsa.mostfrequentchar;

import java.util.HashMap;

/**
 * Finds the most frequent character in a string.
 *
 * @author panpawelw
 */
public class MostFrequentChar {

  public static final String TEST_STRING = "Test string";

  public static void main(String[] args) {
    HashMap<Character, Integer> charCount = new HashMap<>();
    for (int i = 0; i < TEST_STRING.length(); i++) {
      charCount.merge(TEST_STRING.charAt(i), 1, Integer::sum);
    }
  }
}
