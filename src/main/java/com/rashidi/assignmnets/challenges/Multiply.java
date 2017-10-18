package com.rashidi.assignmnets.challenges;

import java.util.Set;
import java.util.TreeSet;

/**
 * This function takes a number as an argument and return the multiples of 3 and 5 up to that number.
 * using Set to avoid counting duplicate elements.
 *
 * @author Mina Rashidi
 */
public class Multiply {
    public static void main(String[] args) {
        multipliesOfThreeAndFive(15).forEach(System.out::println);
        System.out.println(multipliesOfThreeAndFive(15).stream().mapToInt(Integer::intValue).sum());
        System.out.println(getSumMultiplies(15));

    }

    private static Set<Integer> multipliesOfThreeAndFive(int number) {

        Set<Integer> integers = new TreeSet<>();
        int totalForThree = 0;
        int totalForFive = 0;


        for (int i = 3; i <= number; i++) {
            if (i % 3 == 0) {
                totalForThree += i;
                integers.add(i);
            }
            if (i % 5 == 0) {
                totalForFive += i;
                integers.add(i);
            }
        }

        System.out.println("Total for three: " + totalForThree + " " + "Total for five: " + totalForFive);
        System.out.println("Total for both: " + (totalForThree + totalForFive));
        return integers;
    }

    private static int getSumMultiplies(int number) {

        int sum = 0;
        for (int i = 3; i <= number; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum += i;
            }
        }
        return sum;
    }
}
