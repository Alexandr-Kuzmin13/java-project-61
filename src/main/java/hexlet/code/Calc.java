package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Calc {
    public static void gameCalc() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        var newName = scanner.next();
        System.out.println("Hello, " + newName + "!");

        System.out.println("What is the result of the expression?");
        final int numberCykles = 3;
        for (var i = 0; i < numberCykles; i++) {
            Random rnd = new Random();
            final int sizeRandom = 3;
            final int number1SizeRandom = 10;
            final int number2SizeRandom = 100;
            var x1 = (int) (Math.random() * number1SizeRandom);
            var x2 = (int) (Math.random() * number2SizeRandom);
            int x3 = rnd.nextInt(sizeRandom);
            var result = 0;
            final int numberNull = 0;
            final int one = 1;

            if (x3 == numberNull) {
                result = x1 + x2;
                System.out.println("Question: " + x1 + " + " + x2);
            } else if (x3 == one) {
                result = x1 - x2;
                System.out.println("Question: " + x1 + " - " + x2);
            } else {
                result = x1 * x2;
                System.out.println("Question: " + x1 + " * " + x2);
            }

            System.out.print("Your answer: ");

            var answer = scanner.nextInt();
            if (result == answer) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + answer + "'" + " is wrong answer ;(. ");
                System.out.println("Correct answer was " + "'" + result + "'.");
                System.out.println("Let's try again, " + newName + "!");
                return;
            }
            if (i == 2) {
                System.out.println("Congratulations, " + newName + "!");
            }
        }
    }
}
