package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static void gamePrime() {
        Scanner name = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        var newName = name.next();
        System.out.println("Hello, " + newName + "!");

        Scanner newAnswer = new Scanner(System.in);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int[] simple = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        for (var i = 0; i < 3; i++) {
            Random rnd = new Random();
            int x1 = rnd.nextInt(100);
            System.out.println("Question: " + x1);
            System.out.print("Your answer: ");
            var answer = newAnswer.next();

            var result = "";
            for (int k : simple) {
                if (k == x1) {
                    result = "yes";
                    break;
                } else {
                    result = "no";
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
