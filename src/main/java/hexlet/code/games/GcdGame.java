package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GcdGame {
    public static void startGame() {
        Random random = new Random();
        String question = "Find the greatest common divisor of given numbers.";
        String[][] roundAnswers = new String[Engine.NUMBERS_OF_ROUNDS][2];
        for (String[] roundAnswer : roundAnswers) {
            int firstNumber = random.nextInt(100);
            int secondNumber = random.nextInt(100);
            roundAnswer[0] = firstNumber + " " + secondNumber;
            roundAnswer[1] = Integer.toString(findGCD(firstNumber, secondNumber));
        }
        Engine.gameProcess(question, roundAnswers);
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }


}
