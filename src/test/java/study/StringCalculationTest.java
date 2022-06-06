package study;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculationTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @DisplayName("문자열 계산기")
    @ValueSource(strings = {"2 + 3 * 4 / 2"})
    void stringCalc(String input) {
        String[] values = input.split(" ");
        int result = Integer.parseInt(values[0]);
        for (int i = 0; i < values.length; i++) {
            if (!Character.isDigit(values[i].charAt(0))) {
                try {
                    int number = Integer.parseInt(values[i + 1]);
                    result = calculator.calculate(result, number, values[i]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    break;
                }
            }
        }
        assertEquals(result, 10);
    }
}
