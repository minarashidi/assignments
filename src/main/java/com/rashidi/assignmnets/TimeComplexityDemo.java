package com.rashidi.assignmnets;

import java.util.Arrays;

public class TimeComplexityDemo {
    public static void main(String[] args) {

        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("---O(1)---");
        printFirstItem(ints);
        System.out.println("---O(n)---");
        printAllItems(ints);
        System.out.println("---O(n^2)---");
        printAllPossibleOrderedPairs(ints);

    }

    //This function runs in O(1) time (or "constant time") relative to its input.
    private static void printFirstItem(int[] arrayOfItems) {
        System.out.println(arrayOfItems[0]);
    }


    //This function runs in O(n) time (or "linear time"), where n is the number of items in the array.
    private static void printAllItems(int[] arrayOfItems) {
        for (int item : arrayOfItems) {
            System.out.println(item);
        }
    }

    //this function runs in O(n^2) time (or "quadratic time")
    private static void printAllPossibleOrderedPairs(int[] arrayOfItems) {
        int n = arrayOfItems.length - 1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int[] orderedPair = new int[]{arrayOfItems[i], arrayOfItems[j]};
                System.out.println(Arrays.toString(orderedPair));
            }
        }
    }

    private static void printAllPossiblePairs(int[] arrayOfItems) {
        for (int firstItem : arrayOfItems) {
            for (int secondItem : arrayOfItems) {
                int[] orderedPair = new int[]{firstItem, secondItem};
                System.out.println(Arrays.toString(orderedPair));
            }
        }
    }

}
