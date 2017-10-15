package com.rashidi.assignments.challenges;

import com.rashidi.assignmnets.challenges.CreditCard;
import org.junit.Assert;
import org.junit.Test;


public class CreditCardTest {

    @Test
    public void shouldMaskDigitsForBasicCreditsCards() {

        Assert.assertEquals("5###########0694", CreditCard.maskify("5512103073210694"));
    }

    @Test
    public void shouldMaskDigitsForBasicCreditsCardsWithNonDigit() {

        Assert.assertEquals("4###-####-####-5616", CreditCard.maskify("4556-3646-0793-5616"));
    }

    @Test
    public void shouldMaskDigitsForBasicCreditsCardsMoreThanSixCharacters() {

        Assert.assertEquals("6#4321", CreditCard.maskify("654321"));
    }

    @Test
    public void shouldNotMaskDigitsForBasicCreditsCardsLessThanSixCharacters() {

        Assert.assertEquals("54321", CreditCard.maskify("54321"));
    }

    @Test
    public void shouldNotMaskDigitsForBasicCreditsCards() {

        Assert.assertEquals("Skippy", CreditCard.maskify("Skippy"));
    }

}
