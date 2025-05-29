package com.panpawelw.dsa.maxvalue;

public class MaxValue {

  public static final int[] NUMBERS = {1,2,3,4,5};

  public static void main(String[] args) {
    System.out.println("Maximum value is " + getMaximum(NUMBERS));
  }

  private static int getMaximum(int[] numbers) {
    int maximum = Integer.MIN_VALUE;
    if (numbers == null || numbers.length == 0) {
      throw new IllegalArgumentException("Array must not be null or empty");
    }
    for (int number : numbers) {
      if (number > maximum) {
        maximum = number;
      }
    }
    return maximum;
  }
}
