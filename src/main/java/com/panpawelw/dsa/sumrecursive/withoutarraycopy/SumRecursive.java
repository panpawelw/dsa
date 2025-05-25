package com.panpawelw.dsa.sumrecursive.withoutarraycopy;

public class SumRecursive {

  public static final int[] INT_ARRAY = {1,2,3,4,5};

  public static void main(String[] args) {
    System.out.println(sumArray(INT_ARRAY, 0));
  }

  static int sumArray(int[] array, int currentIndex) {
    if (currentIndex == array.length - 1) {
      return array[currentIndex];
    }
    return array[currentIndex] + sumArray(array, currentIndex + 1);
  }
}
