package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class PlayResultTest {
    private Balls answers;

    @BeforeEach
    void setUp() {
        answers = new Balls(Arrays.asList(3, 5, 6));
    }

    @Test
    void isNothing() {
        PlayResult result = answers.play(Arrays.asList(9, 8, 7));
        assertThat(result.getBall()).isEqualTo(0);
        assertThat(result.getStrike()).isEqualTo(0);
    }

    @Test
    void onlyOneBall() {
        PlayResult result = answers.play(Arrays.asList(2, 1, 5));
        assertThat(result.getBall()).isEqualTo(1);
        assertThat(result.getStrike()).isEqualTo(0);
    }

    @Test
    void twoStrike() {
        PlayResult result = answers.play(Arrays.asList(3, 5, 7));
        assertThat(result.getBall()).isEqualTo(0);
        assertThat(result.getStrike()).isEqualTo(2);
    }

    @Test
    void threeStrike() {
        PlayResult result = answers.play(Arrays.asList(3, 5, 6));
        assertThat(result.getBall()).isEqualTo(0);
        assertThat(result.getStrike()).isEqualTo(3);
        assertThat(result.isGameOver()).isTrue();
    }
}
