package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public final class ProgressionGame {
    public static final int PROGRESSION_LENGTH = 10;
    public static final int MAX_STEP = 10;
    public static final int MIN_RANDOM_VALUE = 1;
    public static final int MAX_RANDOM_VALUE = 50;


    public static void startGame() {
        String question = "What number is missing in the progression?";
        String[][] roundAnswers = new String[Engine.NUMBERS_OF_ROUNDS][2];
        for (String[] roundAnswer : roundAnswers) {
            int firstNumber = Utils.randomNumber(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE);
            int step = Utils.randomNumber(MIN_RANDOM_VALUE, MAX_STEP);
            String[] line = progressionLine(firstNumber, step, PROGRESSION_LENGTH);
            int hiddenNumberIndex = Utils.randomNumber(MIN_RANDOM_VALUE, PROGRESSION_LENGTH - 1);
            line[hiddenNumberIndex] = "..";
            roundAnswer[0] = String.join(" ", line);
            roundAnswer[1] = Integer.toString(firstNumber + step * hiddenNumberIndex);
        }
        Engine.gameProcess(question, roundAnswers);
    }

    public static String[] progressionLine(int firstNumber, int step, int length) {
        String[] line = new String[length];
        for (int i = 0; i < length; i++) {
            line[i] = Integer.toString(firstNumber + step * i);
        }
        return line;
    }

    private ProgressionGame() {
        throw new IllegalStateException("Utility class");
    }
}
