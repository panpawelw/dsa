package com.panpawelw.dsa.isprime;

public class Main {
    public static void main(String[] args) {

    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
