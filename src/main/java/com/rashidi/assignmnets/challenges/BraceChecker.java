package com.rashidi.assignmnets.challenges;

import java.util.Stack;

/**
 * See if left parentheses match right parentheses.
 * this function takes a string as an argument and checks whether the string is a balanced parenthesized expression
 *
 * I use stack.
 *
 *
 *@author Mina Rashidi
 */
public class BraceChecker {
    public static void main(String[] args) {

        checkBrace("(a,b)");
        checkBrace("{(a,b)");
        checkBrace("a,b]");
    }

    private static void checkBrace(String braceString) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < braceString.length(); i++) {

            char c = braceString.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    System.out.println("Error char " + c + " at : " + i);
                }
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    System.out.println("Error char " + c + " at : " + i);
                }
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    System.out.println("Error char " + c + " at : " + i);
                }
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Error! missing delimiter");
        }
    }
}
