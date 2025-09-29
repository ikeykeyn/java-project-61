package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBERS_OF_ROUNDS = 3;
    public static final int RANDOM_SEED = 100;

    public static void gameProcess(String question, String[][] roundAnswers) {
        String name = Cli.greeting();
        System.out.println(question);

        for (String[] roundAnswer : roundAnswers) {
            System.out.println("Question: " + roundAnswer[0]);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String inputAnswer = scanner.nextLine();
            if (!inputAnswer.equals(roundAnswer[1])) {
                System.out.println("'"
                        + inputAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + roundAnswer[1]
                        + "'.");
                System.out.println("Let's try again, " + name + "!");
                System.exit(0);
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + name + "!");

    }


}
