package com.panpawelw.dsa.maxvalue;

/**
 * Finds the maximum value in integer array.
 *
 * <p>Example usage:
 * <pre>
 *   int max = MaxValue.getMaximum(new int[]{1, 2, 3});
 * </pre>
 * </p>
 *
 * @author panpawelw
 */
public class MaxValue {

  public static final int[] DEFAULT_NUMBERS = {1,2,3,4,5};

  public static void main(String[] args) {
    System.out.println("Maximum value is " + getMaximum(DEFAULT_NUMBERS));
  }

  /**
   * Returns the maximum value in an integer array.
   *
   * @param numbers the integer array (must not be null or empty)
   * @return        the maximum value
   * @throws        IllegalArgumentException if the array is null or empty
   */
  public static int getMaximum(int[] numbers) {
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
