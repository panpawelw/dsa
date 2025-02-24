package com.panpawelw.dsa.sumrecursive;

import java.util.Arrays;

public class Main {

    public static final int[] INT_ARRAY = {1,2,3,4,5};

    public static void main(String[] args) {
        System.out.println(sumArray(INT_ARRAY));
    }

    static int sumArray(int[] array) {
        if (array.length == 1) {
            return array[0];
        }
        return array[0] + sumArray(Arrays.copyOfRange(array, 1, array.length));
    }
}
