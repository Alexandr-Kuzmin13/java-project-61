package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Progression {
    public static void gameProgression() {
        Scanner name = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        var newName = name.next();
        System.out.println("Hello, " + newName + "!");

        Scanner newAnswer = new Scanner(System.in);
        System.out.println("What number is missing in the progression?");
        for (var i = 0; i < 3; i++) {
            Random rnd = new Random();
            int x1 = rnd.nextInt(100) + 1;
            var x2 = 1 + (int) (Math.random() * 10);
            var x3 = (int) (Math.random() * 10);
            int[] progress = new int[10];
            progress[0] = x1;
            for (var k = 1; k < 10; k++) {
                progress[k] = progress[k - 1] + x2;
            }
            String[] progress2 = new String[10];
            for (var k = 0; k < 10; k++) {
                progress2[k] = progress[k] + "";
            }
            var result = progress[x3];
            progress2[x3] = "..";
            System.out.print("Question: ");
            for (var k = 0; k < 10; k++) {
                System.out.print(progress2[k] + " ");
            }
            System.out.println(" ");
            System.out.print("Your answer: ");
            var answer = newAnswer.nextInt();

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
