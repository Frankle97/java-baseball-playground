package console.in;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputConsole {
    private final Scanner scanner;

    public InputConsole(Scanner scanner) {
        this.scanner = scanner;
    }

    public List<Integer> getInputNumbers() {
        String line = scanner.nextLine();
        if (line.length() != 3) {
            throw new IllegalArgumentException("enter numbers must be only 3 digits");
        }
        return Arrays.stream(line.split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public boolean isRestart() {
        return scanner.nextInt() == 1;
    }
}
