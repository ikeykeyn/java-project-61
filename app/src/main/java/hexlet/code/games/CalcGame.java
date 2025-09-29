package hexlet.code.games;

import hexlet.code.Engine;

public class CalcGame {
    public static final int NUMBER_OF_SIGNS = 3;
    public static final int MIN_RANDOM_VALUE = 1;
    public static final int MAX_RANDOM_VALUE = 100;

    public static void startGame() {
        String question = "What is the result of the expression?";
        String[][] roundAnswers = new String[Engine.NUMBERS_OF_ROUNDS][2];
        for (String[] roundAnswer : roundAnswers) {
            int firstNumber = Engine.randomNumber(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE);
            int secondNumber = Engine.randomNumber(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE);
            String[] signes = {"+", "-", "*"};
            String sign = signes[(int) (Math.random() * NUMBER_OF_SIGNS)];
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
