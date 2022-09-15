package hexlet.code;

import java.util.Scanner;

public class GCD {
    public static void gameGCD() {
        Scanner name = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        var newName = name.next();
        System.out.println("Hello, " + newName + "!");

        Scanner newAnswer = new Scanner(System.in);
        System.out.println("Find the greatest common divisor of given numbers.");
        for (var i = 0; i < 3; i++) {
            var x1 = 1 + (int) (Math.random() * 100) + (int) (Math.random() * 10);
            var x2 = 1 + (int) (Math.random() * 100) + (int) (Math.random() * 10);
                System.out.println("Question: " + x1 + " " + x2);
                System.out.print("Your answer: ");
            var answer = newAnswer.nextInt();

            var newX1 = x1;
            if (x2 > x1) {
                x1 = x2;
                x2 = newX1;
            }
            var result = 0;
                for (var j = 0; j < newX1; j++) {
                    if (x1 % x2 == 0) {
                        result = x2;
                    } else {
                        var z = x1 / x2;
                        var newWX1 = x1;
                        x1 = x2;
                        x2 = newWX1 - (int) Math.floor(z) * x2;
                    }
                }
            if (result == answer) {
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
