package com.panpawelw.dsa.sumrecursive.witharraycopy;

import java.util.Arrays;

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
    System.out.println(sumArray(INT_ARRAY));
  }

  /**
   * Adds up all the integers in an array using recursion.
   * Array is being copied in the process.
   *
   * @param array array of integers to be added up.
   * @return      sum.
   */
  static int sumArray(int[] array) {
    if (array.length == 1) {
      return array[0];
    }
    return array[0] + sumArray(Arrays.copyOfRange(array, 1, array.length));
  }
}
