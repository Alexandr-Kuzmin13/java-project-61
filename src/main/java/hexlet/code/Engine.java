package hexlet.code;

import java.nio.charset.Charset;
import java.util.Scanner;

public class Engine {
    private static final int ROUNDS_NUMBER = 3;
    public static void allEngine(Game game) {
        Scanner scanner = new Scanner(System.in, Charset.defaultCharset());
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        var newName = scanner.next();
        System.out.println("Hello, " + newName + "!");

        game.taskGame();

        for (var i = 0; i < ROUNDS_NUMBER; i++) {

            var result = game.generate();
            System.out.println("Question: " + result);

            System.out.print("Your answer: ");
            var answer = scanner.next();
            if (answer.equals(game.answer(result))) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + answer + "'" + "is wrong answer ;(. ");
                System.out.println("Correct answer was" + "'" + game.answer(result) + "'.\n"
                        + "Let's try again, " + newName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + newName + "!");
        scanner.close();
    }
}
