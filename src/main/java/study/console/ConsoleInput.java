package study.console;

import java.util.Scanner;

public class ConsoleInput {
    private final Scanner scanner;

    public ConsoleInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public String inputNumbers() {
        String line = scanner.nextLine();
        if (line.length() != 3) {
            throw new IllegalArgumentException("enter numbers must be only 3 digits");
        }

        for (char c : line.toCharArray()) {
            checkEnterValueIsNumber(c);
        }
        return line;
    }

    private void checkEnterValueIsNumber(char c) {
        if (!Character.isDigit(c)) {
            throw new IllegalArgumentException("enter numbers only digit");
        }
    }

    public boolean checkRestart() {
        int intentions = scanner.nextInt();
        if (intentions == 1) {
            return true;
        }
        if (intentions == 2) {
            return false;
        }
        throw new IllegalArgumentException("miss input");
    }
}
