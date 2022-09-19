package hexlet.code;

import java.nio.charset.Charset;
import java.util.Scanner;
import java.util.Random;

public class Progression {
    public static void gameProgression() {
        Scanner scanner = new Scanner(System.in, Charset.defaultCharset());
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        var newName = scanner.next();
        System.out.println("Hello, " + newName + "!");

        //Scanner newAnswer = new Scanner(System.in);
        System.out.println("What number is missing in the progression?");
        final int cykle = 3;
        for (var i = 0; i < cykle; i++) {
            Random rnd = new Random();
            final int sizeRandom1 = 10;
            final int sizeRandom2 = 100;
            int firstNumberRandom = rnd.nextInt(sizeRandom2) + 1;
            var twoNumberRandom = 1 + (int) (Math.random() * sizeRandom1);
            var threeNumberRandom = (int) (Math.random() * sizeRandom1);
            final int sizeArray = 10;
            int[] progress = new int[sizeArray];
            progress[0] = firstNumberRandom;
            for (var k = 1; k < sizeArray; k++) {
                progress[k] = progress[k - 1] + twoNumberRandom;
            }
            String[] progress2 = new String[sizeArray];
            for (var k = 0; k < sizeArray; k++) {
                progress2[k] = progress[k] + "";
            }
            var result = progress[threeNumberRandom];
            progress2[threeNumberRandom] = "..";
            System.out.print("Question: ");
            for (var k = 0; k < sizeArray; k++) {
                System.out.print(progress2[k] + " ");
            }
            System.out.println(" ");
            System.out.print("Your answer: ");
            var answer = scanner.nextInt();

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
