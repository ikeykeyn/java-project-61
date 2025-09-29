package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class PrimeGame {
    public static void startGame() {
        Random random = new Random();
        String question = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] roundAnswers = new String[Engine.NUMBERS_OF_ROUNDS][2];
        for (String[] roundAnswer : roundAnswers) {
            int number = random.nextInt(1, Engine.RANDOM_SEED);
            roundAnswer[0] = Integer.toString(number);
            roundAnswer[1] = isPrime(number) ? "yes" : "no";
        }
        Engine.gameProcess(question, roundAnswers);

    }

    public static boolean isPrime(int number) {
        if (number == 0 || number == 1) {
            return false;
        }
        for (var i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
