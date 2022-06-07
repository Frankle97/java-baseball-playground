package study.baseball;

import study.console.ConsoleInput;
import study.console.ConsoleOutput;

public class Referee {
    private final int[] answerNumbers;
    private final int[] inputNumbers;
    private final BaseballResult baseballResult;

    public Referee(int[] answerNumbers, String inputNumbers, BaseballResult baseballResult) {
        this.answerNumbers = answerNumbers;
        this.inputNumbers = convertInputNumbers(inputNumbers);
        this.baseballResult = baseballResult;
    }

    public void game() {
        for (int i = 0; i < inputNumbers.length; i++) {
            int inputNumber = inputNumbers[i];
            for (int j = 0; j < answerNumbers.length; j++) {
                int answerNumber = answerNumbers[j];
                if (i == j && inputNumber == answerNumber) {
                    baseballResult.increaseStrikeCount();
                    break;
                }

                if (i != j && inputNumber == answerNumber) {
                    baseballResult.increaseBallCount();
                }
            }
        }
    }

    private int[] convertInputNumbers(String inputString) {
        int[] array = new int[3];
        for (int i = 0; i < inputString.length(); i++) {
            array[i] = Integer.parseInt(String.valueOf(inputString.charAt(i)));
        }
        return array;
    }

    public boolean checkRestart(ComputerNumbers computerNumbers, ConsoleInput in, ConsoleOutput out) {
        if (!baseballResult.isStrikeOut()) {
            return true;
        }
        out.enterGameEndMessage();
        out.enterAskRestartMessage();
        if (in.checkRestart()) {
            computerNumbers.resetNumbers();
            return true;
        }
        return false;
    }
}
