package baseball;

public class PlayResult {
    private int ball;
    private int strike;

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }

    public void referee(BallStatus status) {
        if (status.isStrike()) {
            strike++;
        }

        if (status.isBall()) {
            ball++;
        }
    }

    public boolean isGameOver() {
        return this.strike == 3;
    }

    public boolean hasBall() {
        return this.ball != 0;
    }

    public boolean hasStrike() {
        return this.strike != 0;
    }

    public boolean isNothing() {
        return this.ball == 0 && this.strike == 0;
    }
}
