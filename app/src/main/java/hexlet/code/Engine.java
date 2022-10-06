package hexlet.code;

import hexlet.code.games.Game;

import java.nio.charset.Charset;
import java.util.Scanner;

public class Engine {
    private static final int ROUNDS_NUMBER = 3;
    public static void run(Game game) {
        Scanner scanner = new Scanner(System.in, Charset.defaultCharset());
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        var newName = scanner.next();
        System.out.println("Hello, " + newName + "!");

        System.out.println(game.getTask());

        for (var i = 0; i < ROUNDS_NUMBER; i++) {

            var result = game.generateAnswer();
            System.out.println("Question: " + result[0]);

            System.out.print("Your answer: ");
            var answer = scanner.next();
            if (answer.equals(result[1])) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + answer + "'" + "is wrong answer ;(. ");
                System.out.println("Correct answer was" + "'" + result[1] + "'.\n"
                        + "Let's try again, " + newName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + newName + "!");
        scanner.close();
    }
}
