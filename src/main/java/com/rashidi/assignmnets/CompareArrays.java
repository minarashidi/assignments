package com.rashidi.assignmnets;

import java.util.Arrays;

/**
 * How to compare array contents?
 *
 * @author Mina rashidi
 */
public class CompareArrays {

    public static void main(String[] args) {

        int[] intArray1 = {1, 2, 3};
        int[] intArray2 = {1, 2, 3};


//        compare the content of two arrays
        if (Arrays.equals(intArray1, intArray2)) {
            System.out.println("Same");
        }

//        compare the content of two multi-dimensional array
//         if the arrays contain arrays inside them or some other references which refer to different object but have same values.

        Object[] objArray1 = {intArray1};
        Object[] objArray2 = {intArray2};

        if (Arrays.equals(objArray1, objArray2)) {
            System.out.println("Same");
        } else {
            System.out.println("Not same");
        }
        if (Arrays.deepEquals(objArray1, objArray2)) {
            System.out.println("Same");
        } else {
            System.out.println("Not same");
        }

    }


}
