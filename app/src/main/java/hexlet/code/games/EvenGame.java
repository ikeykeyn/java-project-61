package hexlet.code.games;

import hexlet.code.Engine;

public final class EvenGame {
    public static final int MIN_RANDOM_VALUE = 1;
    public static final int MAX_RANDOM_VALUE = 100;

    public static void startGame() {
        String question = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] roundAnswers = new String[Engine.NUMBERS_OF_ROUNDS][2];
        for (String[] roundAnswer : roundAnswers) {
            int randomNumber = Engine.randomNumber(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE);
            roundAnswer[0] = Integer.toString(randomNumber);
            roundAnswer[1] = isEven(randomNumber) ? "yes" : "no";
        }
        Engine.gameProcess(question, roundAnswers);

    }
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private EvenGame() {
        throw new IllegalStateException("Utility class");
    }
}
