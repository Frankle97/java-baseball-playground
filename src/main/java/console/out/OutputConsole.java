package console.out;

import baseball.PlayResult;

public class OutputConsole {
    private static final String INPUT_NUMBERS_MESSAGE = "숫자를 입력해 주세요 : ";
    private static final String NOTHING_MESSAGE = "낫싱";
    private static final String BALL_MESSAGE = "볼 ";
    private static final String STRIKE_MESSAGE = "스트라이크 ";
    private static final String STRIKE_OUT_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private static final String ASK_RESTART_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public void enterNumbersMessage() {
        print(INPUT_NUMBERS_MESSAGE);
    }

    public void enterStrikeOut() {
        println(STRIKE_OUT_MESSAGE);
    }
    public void askGameRestart() {
        println(ASK_RESTART_MESSAGE);
    }

    private void println(String message) {
        System.out.println(message);
    }

    private void print(String message) {
        System.out.print(message);
    }

    public void printPlayResult(PlayResult result) {
        String mesaage = "";
        if (result.hasBall()) {
            mesaage += result.getBall() + BALL_MESSAGE;
        }

        if (result.hasStrike()) {
            mesaage += result.getStrike() + STRIKE_MESSAGE;
        }

        if (result.isNothing()) {
            mesaage = NOTHING_MESSAGE;
        }

        println(mesaage);
    }
}
