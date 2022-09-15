package hexlet.code;

import java.util.Scanner;

public class Calc {
    public static void gameCalc() {
        Scanner name = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        var newName = name.next();
        System.out.println("Hello, " + newName + "!");

        Scanner newAnswer = new Scanner(System.in);
        System.out.println("What is the result of the expression?");
        final int NUMBER_OF_CYCLES = 3;
        for (var i = 0; i < NUMBER_OF_CYCLES; i++) {
            final int NUMBER_OF_RANDOM = 10;
            var x1 = (int) (Math.random() * NUMBER_OF_RANDOM);
            var x2 = (int) (Math.random() * 100);
            var result = 0;
            if (x1 == 1 || x1 == 4 || x1 == 7) {
                result = x1 + x2;
                System.out.println("Question: " + x1 + "+" + x2);
            } else if (x1 == 2 || x1 == 5 || x1 == 8) {
                result = x1 - x2;
                System.out.println("Question: " + x1 + "-" + x2);
            } else if (x1 == 3 || x1 == 6 || x1 == 9 || x1 == 0) {
                result = x1 * x2;
                System.out.println("Question: " + x1 + "*" + x2);
            }
            System.out.print("Your answer: ");
            var answer = newAnswer.nextInt();
            if (x1 + x2 == answer || x1 - x2 == answer || x1 * x2 == answer) {
                System.out.println("Correct!");
            } else if (x1 + x2 != answer || x1 - x2 != answer || x1 * x2 != answer) {
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
