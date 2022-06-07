package study.console;

import study.baseball.BaseballResult;

public class ConsoleOutput {
    private final static String ENTER_NUMBER_MESSAGE = "숫자를 입력해 주세요 : ";
    private final static String BALL_MESSAGE = "볼";
    private final static String STRIKE_MESSAGE = "스트라이크";
    private final static String NOTHING_MESSAGE = "낫싱";
    private final static String END_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private final static String ASK_RESTART_MESSAGE = "게임을 새로 시작하시려면 1, 종료하시려면 2를 입력하세요.";

    public void enterNumberMessage() {
        print(ENTER_NUMBER_MESSAGE);
    }

    public void enterGameEndMessage() {
        println(END_MESSAGE);
    }

    public void enterAskRestartMessage() {
        println(ASK_RESTART_MESSAGE);
    }

    public void resultMessage(BaseballResult result) {
        if (result.isBallAndStrike()) {
            println(result.ballCount() + BALL_MESSAGE + " " + result.strikeCount() + STRIKE_MESSAGE);
            return;
        }

        if (result.isOnlyBall()) {
            println(result.ballCount() + BALL_MESSAGE);
        }

        if (result.isOnlyStrike()) {
            println(result.strikeCount() + STRIKE_MESSAGE);
        }

        if (result.isNothing()) {
            println(NOTHING_MESSAGE);
        }
    }

    private void print(String message) {
        System.out.print(message);
    }

    private void println(String message) {
        System.out.println(message);
    }
}
