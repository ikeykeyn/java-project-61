package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class ProgressionGame {
    public static final int PROGRESSION_LENGTH = 10;
    public static final int MAX_FIRST_NUMBER = 100;
    public static final int MAX_STEP = 20;


    public static void startGame() {
        Random random = new Random();
        String question = "What number is missing in the progression?";
        String[][] roundAnswers = new String[Engine.NUMBERS_OF_ROUNDS][2];
        for (String[] roundAnswer : roundAnswers) {
            int firstNumber = random.nextInt(MAX_FIRST_NUMBER);
            int step = random.nextInt(1, MAX_STEP);
            int hiddenNumberIndex = random.nextInt(PROGRESSION_LENGTH);
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
