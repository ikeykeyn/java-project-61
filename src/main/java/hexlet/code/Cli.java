package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void playerName() {
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.close();
        System.out.println("Hello, " + name + "!");
    }
}
