package baseball;

import org.junit.jupiter.api.Test;

public class RandomNumbersTest {

    @Test
    void threeDigitsNumbers1to9() {
        RandomNumbers randomNumbers = new RandomNumbers();
        System.out.println("randomNumbers.drawNumbers() = " + randomNumbers.drawNumbers());
    }
}
