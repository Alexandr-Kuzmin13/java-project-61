package hexlet.code;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void gamePrime() {
        Scanner scanner = new Scanner(System.in, Charset.defaultCharset());
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        var newName = scanner.next();
        System.out.println("Hello, " + newName + "!");

        //Scanner newAnswer = new Scanner(System.in);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        final int cykle = 3;
        for (var i = 0; i < cykle; i++) {
            Random rnd = new Random();
            final int sizeRandom = 100;
            int x1 = rnd.nextInt(sizeRandom);
            System.out.println("Question: " + x1);
            System.out.print("Your answer: ");
            var answer = scanner.next();

            var result = "";
            if (x1 < 2) {
                result = "no";
            }
            for (var j = 2; j < x1; j++) {
                if (x1 % j == 0) {
                    result = "no";
                    break;
                } else {
                    result = "yes";
                }
            }
            if (result.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + "is wrong answer ;(. Correct answer was" + "'" + result + "'.\n"
                        + "Let's try again, " + newName + "!");
                break;
            }
            if (i == 2) {
                System.out.println("Congratulations, " + newName + "!");
            }
        }
    }
}
