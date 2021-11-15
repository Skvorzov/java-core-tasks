package com.java.training;

public class Factorial {

    /**
     * Реализуйте метод getFactorial(int number) который вовзращает факториал числа.
     */
    public int getFactorial(int number) {
        int sum = 1;
        for (int i = 0; i < number; i++) {
            sum = sum * (i + 1);
        }
        return sum;
    }
}
