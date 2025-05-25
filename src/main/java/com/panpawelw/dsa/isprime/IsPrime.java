package com.panpawelw.dsa.isprime;

import java.util.Scanner;

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

  public static boolean isPrime(int number) {
    for (int i = 2; i < number; i++) {
      if (number % i == 0) return false;
    }
    return true;
  }
}
