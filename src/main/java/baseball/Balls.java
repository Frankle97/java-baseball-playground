package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {

    private final List<Ball> balls;

    public Balls(List<Integer> asList) {
        balls = mapBalls(asList);
    }

    private List<Ball> mapBalls(List<Integer> ballNumbers) {
        List<Ball> balls = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            balls.add(new Ball(i + 1, ballNumbers.get(i)));
        }
        return balls;
    }

    public BallStatus play(Ball ball) {
        return balls.stream()
                .map(answer -> answer.play(ball))
                .filter(BallStatus::isNotNothing)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }

    public PlayResult play(List<Integer> ballNumbers) {
        Balls userBalls = new Balls(ballNumbers);
        PlayResult playResult = new PlayResult();
        for (Ball ball : balls) {
            playResult.referee(userBalls.play(ball));
        }
        return playResult;
    }

}
