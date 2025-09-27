package hexlet.code.games;

import hexlet.code.Engine;

public class GcdGame {
    public static void startGame() {
        String question = "Find the greatest common divisor of given numbers.";
        String[][] roundAnswers = new String[Engine.NUMBERS_OF_ROUNDS][2];
        for (String[] roundAnswer : roundAnswers) {
            int firstNumber = (int) (Math.random() * 100);
            int secondNumber = (int) (Math.random() * 100);
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
