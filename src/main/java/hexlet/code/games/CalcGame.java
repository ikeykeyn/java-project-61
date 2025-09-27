package hexlet.code.games;

import hexlet.code.Engine;

public class CalcGame {

    public static void startGame() {
        String question = "What is the result of the expression?";
        String[][] roundAnswers = new String[Engine.NUMBERS_OF_ROUNDS][2];
        for (String[] roundAnswer : roundAnswers) {
            int firstNumber = (int) (Math.random() * 100);
            int secondNumber = (int) (Math.random() * 100);
            String[] signes = {"+", "-", "*"};
            String sign = signes[(int) (Math.random() * signes.length)];
            roundAnswer[0] = firstNumber + " " + sign + " " + secondNumber;
            roundAnswer[1] = Integer.toString(calculateResult(firstNumber, secondNumber, sign));

        }
        Engine.gameProcess(question, roundAnswers);
    }

    private static int calculateResult(int firstNumber, int secondNumber, String sign) {
        int result = 0;
        if  (sign.equals("+")) {
            result = firstNumber + secondNumber;
        } else if (sign.equals("-")) {
            result = firstNumber - secondNumber;
        }  else if (sign.equals("*")) {
            result = firstNumber * secondNumber;
        }
        return result;
    }
}
