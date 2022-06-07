import study.baseball.BaseballResult;
import study.baseball.ComputerNumbers;
import study.baseball.Referee;
import study.console.ConsoleInput;
import study.console.ConsoleOutput;

import java.util.Arrays;
import java.util.Scanner;

public class BaseballApplication {
    public static void main(String[] args) {
        ConsoleInput in = new ConsoleInput(new Scanner(System.in));
        ConsoleOutput out = new ConsoleOutput();
        ComputerNumbers computerNumbers = new ComputerNumbers();

        BaseballResult result = new BaseballResult();
        while (true) {
            System.out.println("computerNumbers = " + Arrays.toString(computerNumbers.getNumbers()));
            result.reset();
            out.enterNumberMessage();

            Referee referee = new Referee(computerNumbers.getNumbers(), in.inputNumbers(), result);
            referee.game();

            out.resultMessage(result);

            if (!referee.checkRestart(computerNumbers, in, out)) {
                return;
            }
        }
    }
}
