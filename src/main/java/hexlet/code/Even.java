package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void isEven(String name) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i ++) {
            Random random = new Random();
            int number = random.nextInt(100);
            System.out.println("Question: " + number);
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine().toLowerCase();
            if (number % 2 == 0 && answer.equals("yes")) {
                System.out.println("Correct!");
            } else if (number % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
            } else if (number % 2 == 0 && answer.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                System.out.println("Let's try again, " + name);
                System.exit(0);
            } else if (number % 2 != 0 && answer.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + name);
                System.exit(0);
            } else {
                System.out.println("Incorrect answer");
                System.exit(0);
            }

        }
        System.out.println("Congratulations, " + name + "!");
    }
}
