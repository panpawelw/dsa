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
    System.out.printf("%d is %sa prime number.%n", number, isPrime(number) ? "" : "not ");
  }

  /**
   * Prompts the user to input an integer.
   *
   * @return the integer entered by user
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
   * Determines whether a given integer is prime.
   * Numbers less than 2 (including negatives, 0, and 1) are not prime.
   *
   * @param number the integer to test
   * @return {@code true} if the number is prime; {@code false} otherwise
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
