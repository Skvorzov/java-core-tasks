package com.java.training;

public class ArrayBalance {

    /**
     * Given an array, return true if there is a place to split the array so that
     * the sum of the numbers on one side is equal to the sum of the numbers on the
     * other side.
     */
    public boolean canBalance(int[] array) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum1 += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            sum2 += array[i];
            sum1 -= array[i];
            if (sum2 == sum1) {
                return true;
            }
        }
        return false;
    }
}
