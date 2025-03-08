package com.panpawelw.dsa.anagrams;

import java.util.HashMap;

public class Main {

    public static final String STRING_ONE = "restful";
    public static final String STRING_TWO = "fluster";

    public static void main(String[] args) {
        System.out.println(charCount(STRING_ONE).equals(charCount(STRING_TWO))?
                "These strings are anagrams.":"These strings are not anagrams.");
    }

    public static HashMap<Character, Integer> charCount(String input) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            charCount.merge(input.charAt(i), 1, Integer::sum);
        }
        return charCount;
    }
}
