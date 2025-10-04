package com.panpawelw.dsa.isprime;

import java.util.Scanner;

/**
 * Checks whether the integer value entered by user is a prime number.
 *
 * <p>Example usage:</p>
 * <pre><code>boolean isPrime = IsPrime.isPrime(8);</code></pre>
 *
 * @author panpawelw
 */
public class IsPrime {

  /* This resource is never closed for simplicity */
  private static final Scanner SCANNER = new Scanner(System.in);

  public static void main(String[] args) {
    int number = readInt();
    System.out.printf("%d is %sa prime number.%n", number, isPrime(number) ?"":"not ");
  }

  /**
   * Prompts the user to input an integer.
   *
   * @return  the integer entered by user
   */
  private static int readInt() {
    System.out.print("Enter an integer: ");
    int number;
    while (!SCANNER.hasNextInt()) {
      System.out.print("Invalid input. Please enter a valid integer: ");
      SCANNER.next();
    }
    number = SCANNER.nextInt();
    return number;
  }

  /**
   * Checks whether the passed integer parameter is a prime number
   * @param number  the integer number to check
   * @return        boolean result
   */
  public static boolean isPrime(int number) {
    if (number < 2) return false;
    int sqrt = (int) Math.sqrt(number);
    for (int i = 2; i <= sqrt; i++) {
      if (number % i == 0) return false;
    }
    return true;
  }
}
