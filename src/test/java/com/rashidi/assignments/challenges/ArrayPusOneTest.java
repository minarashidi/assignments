package com.rashidi.assignments.challenges;

import com.rashidi.assignmnets.challenges.ArrayPlusOne;
import org.junit.Assert;
import org.junit.Test;

/**
 * plusOne() function gets a number as int[] (each digit will be an array element) and add 1 to it and return the result as an other int[],
 * Given [1,2,3] which represents 123, return [1,2,4].
 * Given [9,9,9] which represents 999, return [1,0,0,0].
 *
 * @author Mina Rashidi
 */

public class ArrayPusOneTest {

    @Test
    public void plusOneForDigitsBetween0And9() {

        Assert.assertArrayEquals(new int[]{1, 2, 4}, ArrayPlusOne.plusOne(new int[]{1, 2, 3}));
    }

    @Test
    public void plusOneForDigitsAre9() {

        Assert.assertArrayEquals(new int[]{2, 0, 0}, ArrayPlusOne.plusOne(new int[]{1, 9, 9}));
    }

    @Test
    public void plusOneWhenAllDigitsAre9() {

        Assert.assertArrayEquals(new int[]{1, 0, 0, 0}, ArrayPlusOne.plusOne(new int[]{9, 9, 9}));
    }
}
