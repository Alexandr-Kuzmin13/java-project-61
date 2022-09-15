package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void gameEven() {
        Scanner name = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        var newName = name.next();
        System.out.println("Hello, " + newName + "!");

        Scanner newAnswer = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (var i = 0; i < 3; i++) {
            var x = (int) (Math.random() * 100);
            System.out.println("Question: " + x);
            System.out.print("Your answer: ");
            var answer = newAnswer.next();
            if ((x % 2 == 0 && answer.equals("yes")) || (x % 2 != 0 && answer.equals("no"))) {
                System.out.println("Correct!");
            } else if ((x % 2 == 0 && answer.equals("no")) || (x % 2 != 0 && answer.equals("yes"))) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n"
                        + "Let's try again, " + newName + "!");
                break;
            }
            if (i == 2) {
                System.out.println("Congratulations, " + newName + "!");
            }
        }
    }
}
