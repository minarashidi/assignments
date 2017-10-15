package com.rashidi.assignmnets;

import java.util.Arrays;
import java.util.Collections;

/**
 * return the starting position of the first occurrence of the subArray within the specified Array.
 *
 * @author Mina Rashidi
 */
public class ArrayUtils {

    public int findArrayUsingCollections(Integer[] array, Integer[] subArray) {
        return Collections.indexOfSubList(Arrays.asList(array), Arrays.asList(subArray));
    }

    //    if array is extremely large, let's say 1Gb and subArray is located in the very beginning?
    public int findArray(Integer[] array, Integer[] subArray) {
        int result = -1;
        for (int i = 0; i < array.length - subArray.length; i++) {
            if (matches(i, array, subArray)) {
                result = i;
            }
        }
        return result;
    }

    private boolean matches(int start, Integer[] array, Integer[] subArray) {
        boolean result = true;
        for (int i = start; i < start + subArray.length; i++) {
            if (!array[i].equals(subArray[i - start])) {
                result = false;
                break;
            }
        }
        return result;
    }
}
