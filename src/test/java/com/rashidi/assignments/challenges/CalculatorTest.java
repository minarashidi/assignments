package com.rashidi.assignments.challenges;

import com.rashidi.assignmnets.challenges.Calculator;
import org.junit.Assert;
import org.junit.Test;

/**
 * '3 2 1 - *' ==> 3 * (2 - 1) ==> 3
 * '7 4 5 + * 3 - 10 /' ==> (7 * (4 + 5) - 3) / 10 ==>, should evaluate to 6
 *  empty expression should evaluate to 0
 *  support float numbers
 *  if there are no operations in the input expression, it should return the last value of the expression
 *
 * @author Mina Rashidi
 */
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void shouldSupportMultiplication() {
        Assert.assertEquals(3, calculator.evaluate("1 3 *"), 0);
    }

    @Test
    public void shouldSupportAddition() {
        Assert.assertEquals(4, calculator.evaluate("1 3 +"), 0);
    }

    @Test
    public void shouldSupportSubtraction() {
        Assert.assertEquals(-2, calculator.evaluate("1 3 -"), 0);
    }

    @Test
    public void shouldSupportDivision() {
        Assert.assertEquals(2, calculator.evaluate("4 2 /"), 0);
    }

    @Test
    public void shouldParseNumbers() {
        Assert.assertEquals(3, calculator.evaluate("3"), 0);
    }

    @Test
    public void shouldParseFloats() {
        Assert.assertEquals(3.5, calculator.evaluate("3.5"), 0);
    }

    @Test
    public void returnLastValueWithoutOperations() {
        Assert.assertEquals(5, calculator.evaluate("1 3 5"), 0);
    }
}
