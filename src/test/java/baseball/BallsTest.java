package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BallsTest {

    private Balls answers;

    @BeforeEach
    void setUp() {
        answers = new Balls(Arrays.asList(3, 5, 6));
    }

    @Test
    void isNothing() {
        BallStatus status = answers.play(new Ball(1,9));
        Assertions.assertThat(status).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void isBall() {
        BallStatus status = answers.play(new Ball(1,5));
        Assertions.assertThat(status).isEqualTo(BallStatus.BALL);
    }

    @Test
    void isStrike() {
        BallStatus status = answers.play(new Ball(1,3));
        Assertions.assertThat(status).isEqualTo(BallStatus.STRIKE);
    }
}
