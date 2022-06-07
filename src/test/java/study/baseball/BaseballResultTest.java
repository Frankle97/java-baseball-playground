package study.baseball;

import org.assertj.core.internal.Numbers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class BaseballResultTest {

    @Test
    void isBallAndStrike() {
        BaseballResult result = new BaseballResult();
        result.increaseBallCount();
        result.increaseStrikeCount();
        assertThat(result.isBallAndStrike()).isTrue();
    }

    @Test
    void isOnlyBall() {
        BaseballResult result = new BaseballResult();
        result.increaseBallCount();
        assertThat(result.isOnlyBall()).isTrue();
    }

    @Test
    void isOnlyStrike() {
        BaseballResult result = new BaseballResult();
        result.increaseStrikeCount();
        assertThat(result.isOnlyStrike()).isTrue();
    }

    @Test
    void isStrikeOut() {
        BaseballResult result = new BaseballResult();
        result.increaseStrikeCount();
        result.increaseStrikeCount();
        result.increaseStrikeCount();
        assertThat(result.isStrikeOut()).isTrue();
    }
}