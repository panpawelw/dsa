package com.panpawelw.dsa.maxvalue;

public class Main {
    public static void main(String[] args) {
        int maximum = Integer.MIN_VALUE;
        int[] numbers = new int[]{1,2,3,4,5};
        for (int number : numbers) {
            if (number > maximum) {
                maximum = number;
            }
        }
        System.out.println("Maximum value is " + maximum);
    }
}
