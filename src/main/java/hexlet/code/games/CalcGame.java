package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class CalcGame {
    public static final int NUMBER_OF_SIGNS = 3;

    public static void startGame() {
        Random random = new Random();
        String question = "What is the result of the expression?";
        String[][] roundAnswers = new String[Engine.NUMBERS_OF_ROUNDS][2];
        for (String[] roundAnswer : roundAnswers) {
            int firstNumber = random.nextInt(Engine.RANDOM_SEED);
            int secondNumber = random.nextInt(Engine.RANDOM_SEED);
            String[] signes = {"+", "-", "*"};
            String sign = signes[random.nextInt(NUMBER_OF_SIGNS)];
            roundAnswer[0] = firstNumber + " " + sign + " " + secondNumber;
            roundAnswer[1] = Integer.toString(calculateResult(firstNumber, secondNumber, sign));
        }
        Engine.gameProcess(question, roundAnswers);
    }

    private static int calculateResult(int firstNumber, int secondNumber, String sign) {
        return switch (sign) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            default -> 0;
        };
    }
}
