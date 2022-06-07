package study.baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

public class RandomNumbersTest {

    @Test
    @DisplayName("1~9 사이의 중복되지 않는 세 자리 난수")
    void nonDuplicateThreeDigitNumbers() {
        Set<Integer> setOfIntegers = new HashSet<>();
        do {
            setOfIntegers.add(new Random().nextInt(9) + 1);
        } while (setOfIntegers.size() != 3);
        int[] numbers = setOfIntegers.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("numbers = " + Arrays.toString(numbers));
    }
}
