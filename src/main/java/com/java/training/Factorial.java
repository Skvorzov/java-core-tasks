package com.java.training;

public class Factorial {

    /**
     * Реализуйте метод getFactorial(int number) который вовзращает факториал числа.
     */
    public int getFactorial(int number) {
        int[] arr = new int[number];
        int num = 1;
        int sum = 1;
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = num;
            num++;
            sum = sum * arr[i];
        }
        return sum;
    }
}
