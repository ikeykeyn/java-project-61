package hexlet.code.games;

import hexlet.code.Engine;


public class ProgressionGame {
    public static final int PROGRESSION_LENGTH = 10;
    public static final int MAX_STEP = 20;
    public static final int MIN_RANDOM_VALUE = 1;
    public static final int MAX_RANDOM_VALUE = 100;


    public static void startGame() {
        String question = "What number is missing in the progression?";
        String[][] roundAnswers = new String[Engine.NUMBERS_OF_ROUNDS][2];
        for (String[] roundAnswer : roundAnswers) {
            int firstNumber = Engine.randomNumber(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE);
            int step = Engine.randomNumber(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE);
            int hiddenNumberIndex = Engine.randomNumber(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE);
            roundAnswer[0] = progressionLine(firstNumber, step, hiddenNumberIndex);
            roundAnswer[1] = Integer.toString(firstNumber + step * hiddenNumberIndex);
        }
        Engine.gameProcess(question, roundAnswers);
    }

    public static String progressionLine(int firstNumber, int step, int hiddenNumberIndex) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < PROGRESSION_LENGTH; i++) {
            if (i != hiddenNumberIndex) {
                sb.append(firstNumber + step * i).append(" ");
            }  else {
                sb.append("..").append(" ");
            }
        }
        return sb.toString();
    }
}
