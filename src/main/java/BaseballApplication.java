import baseball.Balls;
import baseball.PlayResult;
import baseball.RandomNumbers;
import console.in.InputConsole;
import console.out.OutputConsole;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BaseballApplication {
    public static void main(String[] args) {
        InputConsole input = new InputConsole(new Scanner(System.in));
        OutputConsole output = new OutputConsole();

        List<Integer> randomNumbers = RandomNumbers.getRandomNumbers();
        System.out.println(Arrays.toString(randomNumbers.toArray()));
        Balls computerBalls = new Balls(randomNumbers);

        while (true) {
            output.enterNumbersMessage();
            PlayResult result = computerBalls.play(input.getInputNumbers());
            output.printPlayResult(result);

            if (result.isGameOver()) {
                output.enterStrikeOut();
                output.askGameRestart();
                if (!input.isRestart()) {
                    return;
                }
                computerBalls = new Balls(RandomNumbers.getRandomNumbers());
            }
        }
    }
}
