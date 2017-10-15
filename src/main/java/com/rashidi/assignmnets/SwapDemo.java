package com.rashidi.assignmnets;

/**
 * Swapping two numbers/ String variables without using temp variable in Java
 *
 * @author Mina Rashidi
 */
public class SwapDemo {

    public static void main(String[] args) {

        swappingTwoNumbers(10, 20);
        swappingTwoStringVariables("Hello", "world");
    }

    private static void swappingTwoNumbers(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Numbers after swap: a = " + a + " and b = " + b);
    }

    private static void swappingTwoStringVariables(String a, String b) {

        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("Strings after swap: a = " + a + " and b = " + b);
    }

}
