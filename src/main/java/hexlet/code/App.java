package hexlet.code;

import hexlet.code.games.EvenGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        int gameType = scanner.nextInt();
        switch (gameType) {
            case 1:
                Cli.greeting();
            case 2:
                EvenGame.startGame();
        }
    }
}
