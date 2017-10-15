package com.rashidi.assignments.challenges;

import com.rashidi.assignmnets.challenges.NumberToOrdinalConverter;
import org.junit.Assert;
import org.junit.Test;


public class NumberToOrdinalTest {

    @Test
    public void shouldHandleSingleDigits() {
        Assert.assertEquals("0", NumberToOrdinalConverter.numberToOrdinal(0));
        Assert.assertEquals("1st", NumberToOrdinalConverter.numberToOrdinal(1));
        Assert.assertEquals("2nd", NumberToOrdinalConverter.numberToOrdinal(2));
        Assert.assertEquals("3rd", NumberToOrdinalConverter.numberToOrdinal(3));
        Assert.assertEquals("11th", NumberToOrdinalConverter.numberToOrdinal(11));
        Assert.assertEquals("33rd", NumberToOrdinalConverter.numberToOrdinal(33));
        Assert.assertEquals("92nd", NumberToOrdinalConverter.numberToOrdinal(92));
        Assert.assertEquals("13th", NumberToOrdinalConverter.numberToOrdinal(13));
        Assert.assertEquals("111th", NumberToOrdinalConverter.numberToOrdinal(111));
    }

}
