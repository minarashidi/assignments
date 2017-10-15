package com.rashidi.assignments;

import com.rashidi.assignmnets.ArrayUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Mina Rashidi
 */
public class ArrayUtilsTest {

    @Test
    public void testOnceInTheMiddle() {
        Integer[] array = {4, 9, 3, 7, 8};
        Integer[] subArray = {3, 7};

        ArrayUtils myFindArray = new ArrayUtils();
        int actual = myFindArray.findArray(array, subArray);
        Assert.assertEquals(actual, 2);
    }

    @Test
    public void testOnceInTheStart() {
        Integer[] array = {1, 3, 5};
        Integer[] subArray = {1};

        ArrayUtils arrayUtils = new ArrayUtils();
        int actual = arrayUtils.findArray(array, subArray);
        Assert.assertEquals(actual, 0);
    }

    @Test
    public void testDoesNotExist() {
        Integer[] array = {7, 8, 9};
        Integer[] subArray = {8, 9, 10};

        ArrayUtils myFindArray = new ArrayUtils();
        int actual = myFindArray.findArray(array, subArray);
        Assert.assertEquals(actual, -1);
    }

    @Test
    public void testTwice() {
        Integer[] array = {4, 9, 3, 7, 8, 3, 7, 1};
        Integer[] subArray = {3, 7};

        ArrayUtils myFindArray = new ArrayUtils();
        int actual = myFindArray.findArray(array, subArray);
        Assert.assertEquals(actual, 5);
    }
}
