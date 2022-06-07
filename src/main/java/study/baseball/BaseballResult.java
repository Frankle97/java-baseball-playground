package study.baseball;

public class BaseballResult {
    private int ballCount;
    private int strikeCount;

    public void reset() {
        this.strikeCount = 0;
        this.ballCount = 0;
    }

    public int ballCount() {
        return this.ballCount;
    }

    public int strikeCount() {
        return this.strikeCount;
    }

    public void increaseBallCount() {
        this.ballCount++;
    }

    public void increaseStrikeCount() {
        this.strikeCount++;
    }

    public boolean isBallAndStrike() {
        return this.ballCount > 0 && this.strikeCount > 0;
    }

    public boolean isOnlyBall() {
        return this.ballCount > 0 && this.strikeCount == 0;
    }

    public boolean isOnlyStrike() {
        return this.ballCount == 0 && this.strikeCount > 0;
    }

    public boolean isNothing() {
        return this.ballCount == 0 && this.strikeCount == 0;
    }

    public boolean isStrikeOut() {
        return this.strikeCount == 3;
    }

}
