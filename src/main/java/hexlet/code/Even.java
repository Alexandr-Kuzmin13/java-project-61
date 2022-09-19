package hexlet.code;

import java.nio.charset.Charset;
import java.util.Scanner;

public class Even {
    public static void gameEven() {
        Scanner scanner = new Scanner(System.in, Charset.defaultCharset());
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        var newName = scanner.next();
        System.out.println("Hello, " + newName + "!");

        //Scanner newAnswer = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        final int numberCykles = 3;
        for (var i = 0; i < numberCykles; i++) {
            final int numberSizeRandom = 100;
            var x = (int) (Math.random() * numberSizeRandom);
            String right = "";
            if (x % 2 == 0) {
                right = "yes";
            } else {
                right = "no";
            }
            System.out.println("Question: " + x);
            System.out.print("Your answer: ");
            var answer = scanner.next();
            if (right.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + answer + "'" + " is wrong answer ;(. ");
                System.out.println("Correct answer was " + "'" + right + "'.");
                System.out.println("Let's try again, " + newName + "!");
                return;
            }
            if (i == 2) {
                System.out.println("Congratulations, " + newName + "!");
            }
        }
    }
}
