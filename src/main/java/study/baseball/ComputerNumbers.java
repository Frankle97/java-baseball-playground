package study.baseball;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ComputerNumbers {
    private int[] numbers;

    public ComputerNumbers() {
        this.numbers = createNumbers();
    }

    private int[] createNumbers() {
        Set<Integer> setOfIntegers = new HashSet<>();
        do {
            setOfIntegers.add(new Random().nextInt(9) + 1);
        } while (setOfIntegers.size() != 3);

        return setOfIntegers.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void resetNumbers() {
        this.numbers = createNumbers();
    }
}
