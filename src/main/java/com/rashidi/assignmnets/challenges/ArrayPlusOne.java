package com.rashidi.assignmnets.challenges;

import java.util.Arrays;

/**
 *
 * plusOne() function gets a number as int[] (each digit will be an array element) and add 1 to it and return the result as an other int[],
 * Given [1,2,3] which represents 123, return [1,2,4].
 * Given [9,9,9] which represents 999, return [1,0,0,0].
 *
 * @author Mina Rashidi
 */

public class ArrayPlusOne {

    public static void main(String[] args) {

        int[] ints = {8, 9, 9};
        Arrays.stream(plusOne(ints)).forEach(System.out::println);

    }

    public static int[] plusOne(int[] digits) {

        int size = digits.length;

        for (int i = size - 1; i >= 0; i--) {

            digits[i]++;

            if (digits[i] < 10) {
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int[] result = new int[size + 1];
        System.arraycopy(digits, 0, result, 1, size);
        result[0] = 1;
        return result;

    }
}
