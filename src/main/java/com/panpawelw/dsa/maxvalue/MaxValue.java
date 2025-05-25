package com.panpawelw.dsa.maxvalue;

public class MaxValue {

  public static final int[] NUMBERS = {1,2,3,4,5};

  public static void main(String[] args) {
    int maximum = Integer.MIN_VALUE;
    for (int number : NUMBERS) {
      if (number > maximum) {
        maximum = number;
      }
    }
    System.out.println("Maximum value is " + maximum);
  }
}
