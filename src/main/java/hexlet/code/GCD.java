package hexlet.code;

import java.nio.charset.Charset;
import java.util.Scanner;

public class GCD {
    public static void gameGCD() {
        Scanner scanner = new Scanner(System.in, Charset.defaultCharset());
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        var newName = scanner.next();
        System.out.println("Hello, " + newName + "!");

        //Scanner newAnswer = new Scanner(System.in);
        System.out.println("Find the greatest common divisor of given numbers.");
        final int cykle = 3;
        for (var i = 0; i < cykle; i++) {
            final int sizeRandom1 = 10;
            final int sizeRandom2 = 100;
            var x1 = 1 + (int) (Math.random() * sizeRandom2) + (int) (Math.random() * sizeRandom1);
            var x2 = 1 + (int) (Math.random() * sizeRandom2) + (int) (Math.random() * sizeRandom1);
            System.out.println("Question: " + x1 + " " + x2);
            System.out.print("Your answer: ");
            var answer = scanner.nextInt();

            var newX1 = x1;
            if (x2 > x1) {
                x1 = x2;
                x2 = newX1;
            }
            var result = 0;
            /*for (var j = 0; j < newX1; j++) {
                if (x1 % x2 == 0) {
                    result = x2;
                } else {
                    var z = x1 / x2;
                    var newWX1 = x1;
                    x1 = x2;
                    x2 = newWX1 - (int) Math.floor(z) * x2;
                }*/
            for (var j = x2; j > 0; j--) {
                System.out.println(x1 + " " + x2);
                if (x1 % j == 0 && x2 % j == 0) {
                    result = j;
                    break;
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
