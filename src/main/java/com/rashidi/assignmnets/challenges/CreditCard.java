package com.rashidi.assignmnets.challenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * maskify() function masks all but the first and last four characters with '#'.
 * non-digits should never be masked.
 *
 * @author Mina Rashidi
 */
public class CreditCard {

    private static final Pattern CARD_PATTERN = Pattern.compile("\\b([0-9]{1})(.{1,14})([0-9]{4})\\b");
    private static final Pattern INNER_PATTERN = Pattern.compile("[0-9]");

    public static String maskify(String creditCardNumber) {

        Matcher matcher = CARD_PATTERN.matcher(creditCardNumber);//match the given input against this pattern.

        if (!matcher.find()) {
            return creditCardNumber;
        }

        String group1 = matcher.group(1);
        String group2 = matcher.group(2);
        String group3 = matcher.group(3);

        Matcher matcher2 = INNER_PATTERN.matcher(group2);
        return group1 + matcher2.replaceAll("#") + group3;
    }
}