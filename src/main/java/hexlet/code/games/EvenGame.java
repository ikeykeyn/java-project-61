package hexlet.code.games;

import hexlet.code.Engine;

public class EvenGame {
    public static void startGame() {
        String question = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] roundAnswers = new String[Engine.NUMBERS_OF_ROUNDS][2];
        for (String[] roundAnswer : roundAnswers) {
            int randomNumber = (int) (Math.random() * 100);
            roundAnswer[0] = Integer.toString(randomNumber);
            roundAnswer[1] = isEven(randomNumber) ? "yes" : "no";
        }
        Engine.gameProcess(question, roundAnswers);

    }
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
