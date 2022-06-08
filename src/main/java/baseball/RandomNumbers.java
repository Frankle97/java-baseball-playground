package baseball;

import java.util.*;

public class RandomNumbers {

    private final List<Integer> numbers;

    public RandomNumbers() {
        numbers = getRandomNumbers();
    }

    public static List<Integer> getRandomNumbers() {
        final List<Integer> numbers;
        Set<Integer> numberSet = new HashSet<>();
        while (numberSet.size() < 3) {
            numberSet.add(new Random().nextInt(9) + 1);
        }
        numbers = new ArrayList<>(numberSet);
        return numbers;
    }

    public List<Integer> drawNumbers() {
        return this.numbers;
    }
}
