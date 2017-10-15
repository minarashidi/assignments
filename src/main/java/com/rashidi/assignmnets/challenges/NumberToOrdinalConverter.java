package com.rashidi.assignmnets.challenges;

/**
 *
 * numberToOrdinal() function takes a number and return it as a string with the correct
 * ordinal indicator suffix(in English)
 *
 * @author :Mina Rashidi
 */
public class NumberToOrdinalConverter {

    public static String numberToOrdinal(Integer number) {

        String[] suffixes = new String[]{"th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th"};

        switch (number % 100) {
            case 11:
            case 12:
            case 13:
                return number + "th";
            default:
                return number == 0 ? "0" : number + suffixes[number % 10];

        }
    }
}
