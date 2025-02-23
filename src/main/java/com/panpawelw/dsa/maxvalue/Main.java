package com.panpawelw.dsa.maxvalue;

public class Main {

    public static final int[] numbers = new int[]{1,2,7,4,5};

    public static void main(String[] args) {
        int maximum = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > maximum) {
                maximum = number;
            }
        }
        System.out.println("Maximum value is " + maximum);
    }
}
