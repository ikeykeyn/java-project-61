package hexlet.code;

import java.util.Scanner;

public class Greeting {
    public static Integer greet() {
        System.out.println("Please enter the game number and press Enter!");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
