package com.rashidi.assignmnets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Searches the specified array of the given data type for the specified value using the binary search algorithm.
 * Arrays.binarySearch() is the simplest and most efficient method to find an element in a sorted array in Java
 * data_type can be any of the primitive data types: byte, char, double, int, float, short, long and Object as well.
 * The array must be sorted prior to making this call. If it is not sorted, the results are undefined.
 * Arrays.binarysearch() works for arrays which can be of primitive data type also.
 * Collections.binarysearch() works for objects Collections like ArrayList and LinkedList.
 *
 * @author Mina Rashidi
 */
public class BinarySearchDemo {

    public static void main(String[] args) {

        byte[] byteArray = {10, 20, 15, 22, 35};
        char[] charArray = {'g', 'p', 'q', 'c', 'i'};
        int[] intArray = {10, 20, 15, 22, 35};
        double[] doubleArray = {10.2, 15.1, 2.2, 3.5};
        float[] floatArray = {10.2f, 15.1f, 2.2f, 3.5f};
        short[] shortArray = {10, 20, 15, 22, 35};

        Arrays.sort(byteArray);
        Arrays.sort(charArray);
        Arrays.sort(intArray);
        Arrays.sort(doubleArray);
        Arrays.sort(floatArray);
        Arrays.sort(shortArray);

        byte byteKey = 35;
        char charKey = 'g';
        int intKey = 22;
        double doubleKey = 1.5;
        float floatKey = 35;
        short shortKey = 5;

        System.out.println(byteKey + " found at index = " + Arrays.binarySearch(byteArray, byteKey));
        System.out.println(charKey + " found at index = " + Arrays.binarySearch(charArray, charKey));
        System.out.println(intKey + " found at index = " + Arrays.binarySearch(intArray, intKey));
        System.out.println(doubleKey + " found at index = " + Arrays.binarySearch(doubleArray, doubleKey));
        System.out.println(floatKey + " found at index = " + Arrays.binarySearch(floatArray, floatKey));
        System.out.println(shortKey + " found at index = " + Arrays.binarySearch(shortArray, shortKey));


//        Searching a name key in a list
        List<String> names = Arrays.asList("Mina", "Sara", "Anni", "Daniel");
        Collections.sort(names);
        String nameKey = "Sara";
        System.out.println(nameKey + " found at index = " + Collections.binarySearch(names, nameKey));

//        Searching an int key in a list sorted in descending order.
        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(50);
        numbers.add(30);
        numbers.add(10);
        numbers.add(2);

        // The last parameter specifies the comparator method
        int index = Collections.binarySearch(numbers, 50, Collections.reverseOrder());
        System.out.println("Found at index " + index);
    }
}
