package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class PrimeGame {
    public static final int MIN_RANDOM_VALUE = 1;
    public static final int MAX_RANDOM_VALUE = 100;

    public static void startGame() {
        String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] roundAnswers = new String[Engine.NUMBERS_OF_ROUNDS][2];
        for (String[] roundAnswer : roundAnswers) {
            int number = Utils.randomNumber(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE);
            roundAnswer[0] = Integer.toString(number);
            roundAnswer[1] = isPrime(number) ? "yes" : "no";
        }
        Engine.gameProcess(question, roundAnswers);

    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (var i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private PrimeGame() {
        throw new IllegalStateException("Utility class");
    }
}
