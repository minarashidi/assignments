package com.rashidi.assignmnets.algorithms.search;

/**
 * Linear search is a simple search algorithm. It is a sequential search over all items.
 * Every item is checked and if it is found then the item is returned, otherwise the search continues to the end.
 *
 *
 * Time complexity is O(n)
 *
 * @author Mina Rashidi
 */
public class LinearSearch {

    public static void main(String[] args) {

        LinearSearch linearSearch = new LinearSearch();
        int[] array = {15, 23, 34, 40, 88};
        int value = 34;
        int result = linearSearch.search(array, value);
        if (result == -1) {
            System.out.println("Element is not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }


    private int search(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {
            // Return the index of the element if the element is found
            if (array[i] == value)
                return i;
        }
        // return -1 if the element is not found
        return -1;
    }

}
