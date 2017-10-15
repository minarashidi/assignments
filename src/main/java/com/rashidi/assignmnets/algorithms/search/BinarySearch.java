package com.rashidi.assignmnets.algorithms.search;

/**
 * Binary search is a fast search algorithm that searches a sorted array by repeatedly dividing the search interval in half.
 * When we want to search an element in a sorted array, a simple approach is to do "linear search" which has time complexity of O(n).
 * Another approach is using binary search to reduce the time complexity to O(Log n).
 *
 * Begin with an interval covering the whole array.
 * If the middle item is greater than the search item, then we search the item in the left sub-array of the middle item.
 * Otherwise, it is searched in the right sub-array of the middle item.
 * Repeatedly check until the value is found or the interval is empty.
 *
 * Time complexity is O(log n)
 *
 * @author Mina Rashidi
 */
public class BinarySearch {

    public static void main(String args[]) {

        BinarySearch binarySearch = new BinarySearch();

        int[] array = {15, 23, 34, 40, 88};
        int value = 34;
        int result = binarySearch.search(array, value);
        if (result == -1) {
            System.out.println("Element is not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

    private int search(int[] array, int value) {

        int lowIndex = 0;
        int highIndex = array.length - 1;

        while (lowIndex <= highIndex) {

            int middleIndex = (highIndex + lowIndex) / 2;

            // Check if value is present at middle
            if (array[middleIndex] == value) {
                return middleIndex;
            }
            // If value is greater, ignore left half
            if (array[middleIndex] < value) {
                lowIndex = middleIndex + 1;
            }
            // If value is smaller, ignore right half
            else {
                highIndex = middleIndex - 1;
            }
        }
        // if the element was not present
        return -1;
    }

}
