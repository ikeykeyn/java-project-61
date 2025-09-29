package hexlet.code;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GcdGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String gameType = scanner.nextLine();
        switch (gameType) {
            case "1" -> Cli.greeting();
            case "2" -> EvenGame.startGame();
            case "3" -> CalcGame.startGame();
            case "4" -> GcdGame.startGame();
            case "5" -> ProgressionGame.startGame();
            case "6" -> PrimeGame.startGame();
            default -> {
                System.exit(0);
            }
        }
    }
}
