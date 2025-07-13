package com.panpawelw.dsa.sumrecursive.withoutarraycopy;

/**
 * Adds up all the integers in an array using recursion.
 *
 * <p>Example usage:
 * <pre>
 *   int arraySum = SumRecursive.sumArray(new int[]{1, 2, 3, 4, 5});
 * </pre>
 * </p>
 *
 * @author panpawelw
 */
public class SumRecursive {

  public static final int[] INT_ARRAY = {1,2,3,4,5};

  public static void main(String[] args) {
    System.out.println(sumArray(INT_ARRAY, 0));
  }

  /**
   * Adds up all the integers in an array using recursion.
   * Array is not being copied in the process, array index is used instead.
   *
   * @param array array of integers to be added up
   * @return      the sum
   */
  static int sumArray(int[] array, int currentIndex) {
    if (currentIndex == array.length - 1) {
      return array[currentIndex];
    }
    return array[currentIndex] + sumArray(array, currentIndex + 1);
  }
}
