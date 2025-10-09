package com.panpawelw.dsa.anagrams;

import java.util.HashMap;

/**
 * Checks whether two provided strings are anagrams.
 *
 * <p>Example usage:</p>
 * <pre><code>boolean areAnagrams = Anagrams.charCount(STRING_ONE).equals(Anagrams.charCount(STRING_TWO));</code></pre>
 *
 * @author panpawelw
 */
public class Anagrams {

  public static final String STRING_ONE = "restful";
  public static final String STRING_TWO = "fluster";

  public static void main(String[] args) {
    System.out.println(charCount(STRING_ONE).equals(charCount(STRING_TWO))?
        "These strings are anagrams.":"These strings are not anagrams.");
  }

  /**
   * Returns the hashmap with character count in the provided string.
   *
   * @param input string
   * @return      character count
   */
  public static HashMap<Character, Integer> charCount(String input) {
    HashMap<Character, Integer> charCount = new HashMap<>();
    for (int i = 0; i < input.length(); i++) {
      charCount.merge(input.charAt(i), 1, Integer::sum);
    }
    return charCount;
  }
}
