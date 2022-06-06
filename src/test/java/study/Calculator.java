package study;

import org.junit.platform.commons.util.StringUtils;

import java.text.NumberFormat;
import java.util.NoSuchElementException;

public final class Calculator {
    public int calculate(int a, int b, String delimeter) {
        switch (delimeter) {
            case "+":
                return plus(a, b);
            case "-":
                return minus(a, b);
            case "*":
                return multiply(a, b);
            case "/":
                return divide(a, b);
            default:
                throw new IllegalArgumentException();
        }
    }

    public int plus(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public boolean isNumeric(String input) {
        return input.matches("[+-]?\\d*(\\.\\d+)?");
    }
}
