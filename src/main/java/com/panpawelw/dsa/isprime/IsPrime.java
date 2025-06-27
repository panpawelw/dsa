package com.panpawelw.dsa.isprime;

import java.util.Scanner;

/**
 * Checks whether the integer value entered by user is a prime number.
 *
 * @author panpawelw
 */
public class IsPrime {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    while(!scanner.hasNextInt()) {
      scanner.next();
    }
    int number = scanner.nextInt();
    System.out.printf("%d is %sa prime number\n", number, isPrime(number) ?"":"not ");
    scanner.close();
  }

  /**
   * Checks whether the passed integer parameter is a prime number.
   * @param number  the integer number to check.
   * @return        boolean response.
   */
  public static boolean isPrime(int number) {
    if (number < 2) return false;
    for (int i = 2; i < Math.sqrt(number); i++) {
      if (number % i == 0) return false;
    }
    return true;
  }
}
