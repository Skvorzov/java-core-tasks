package com.java.training;

public class StringSumDigits {

    /**
     * Given a string, return the sum of the digits 0-9 that appear in the string,
     * ignoring all other characters. Return 0 if there are no digits in the string.
     */
    public int sumDigits(String str) {
        String[] numbers = str.replaceAll("[^-?0-9]+", "").trim().split("");
        int arr[] = new int[numbers.length];
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.parseInt(numbers[i]);
        }
        if (arr.length == 0) {
            return 0; // i dont understand how to correctly return 0, if there are no digits in the string.
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
