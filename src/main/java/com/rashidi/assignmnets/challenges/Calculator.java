package com.rashidi.assignmnets.challenges;

import java.util.Arrays;

/**
 * create a calculator which evaluates expressions given to it in string format
 * the expressions are numbers and operators.Go through the expression left to right,
 * keep track of the numbers, when you find operator, apply it to the previous two numbers, replace them with the result
 *
 * @author Mina Rashidi
 */
public class Calculator {

    public double evaluate(String expr) {
        if (expr == null || expr.isEmpty()) {
            return 0;
        }

        String[] operators = new String[]{"/", "*", "-", "+"};

        if (Arrays.stream(operators).parallel().noneMatch(expr::contains)) {
            String[] parts = expr.split(" ");
            return Double.valueOf(parts[parts.length - 1]);
        }

        while (Arrays.stream(operators).parallel().anyMatch(expr::contains)) {
            String[] parts = expr.split(" ");
            for (int i = 0; i < parts.length; i++) {
                if (Arrays.stream(operators).parallel().anyMatch(parts[i]::contains)) {
                    String expression = parts[i - 2] + " " + parts[i - 1] + " " + parts[i] + " ";
                    String substitute = "";

                    if ("+".equals(parts[i])) {
                        substitute = String.valueOf(Double.valueOf(parts[i - 2]) + Double.valueOf(parts[i - 1]));
                    } else if ("-".equals(parts[i])) {
                        substitute = String.valueOf(Double.valueOf(parts[i - 2]) - Double.valueOf(parts[i - 1]));
                    } else if ("*".equals(parts[i])) {
                        substitute = String.valueOf(Double.valueOf(parts[i - 2]) * Double.valueOf(parts[i - 1]));
                    } else if ("/".equals(parts[i])) {
                        substitute = String.valueOf(Double.valueOf(parts[i - 2]) / Double.valueOf(parts[i - 1]));
                    }

                    if (parts.length <= 3) {
                        return Double.valueOf(substitute);
                    }

                    expr = expr.replace(expression, substitute + " ");
                    break;
                }
            }
        }
        return Double.valueOf(expr);
    }
}
