package hexlet.code;

public class App {
    public static void main(String[] args) {
        Integer gameType = Greeting.greet();
        if (gameType == 1) {
            Cli.playerName();
        } else if (gameType == 2) {
            Even.isEven(Cli.playerName());
        } else if (gameType == 0) {
            System.exit(0);
        }
    }
}
