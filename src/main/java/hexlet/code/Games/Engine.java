package hexlet.code.games;

import java.nio.charset.Charset;
import java.util.Scanner;

public class Engine {
    public static void allEngine(int choose) {
        Scanner scanner = new Scanner(System.in, Charset.defaultCharset());
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        var newName = scanner.next();
        System.out.println("Hello, " + newName + "!");

        final int numberTwo = 2;
        final int numberThree = 3;
        final int numberFour = 4;
        final int numberFive = 5;
        final int numberSix = 6;

        switch (choose) {
            case numberTwo -> System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            case numberThree -> System.out.println("What is the result of the expression?");
            case numberFour -> System.out.println("Find the greatest common divisor of given numbers.");
            case numberFive -> System.out.println("What number is missing in the progression?");
            case numberSix -> System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            default -> throw new IllegalStateException("Unexpected value: " + choose);
        }

        final int cykle = 3;
        for (var i = 0; i < cykle; i++) {

            var resultNumber = 0;
            var resultWord = "";

            if (choose == numberTwo) {
                resultWord = Even.gameEven();
            } else if (choose == numberThree) {
                resultNumber = Calc.gameCalc();
            } else if (choose == numberFour) {
                resultNumber = GCD.gameGCD();
            } else if (choose == numberFive) {
                resultNumber = Progression.gameProgression();
            } else {
                resultWord = Prime.gamePrime();
            }

            if (choose == numberThree || choose == numberFour || choose == numberFive) {
                System.out.print("Your answer: ");
                var answer = scanner.nextInt();
                if (resultNumber == answer) {
                    System.out.println("Correct!");
                } else {
                    System.out.print("'" + answer + "'" + "is wrong answer ;(. ");
                    System.out.println("Correct answer was" + "'" + resultNumber + "'.\n"
                            + "Let's try again, " + newName + "!");
                    return;
                }
            } else {
                System.out.print("Your answer: ");
                var answer = scanner.next();
                if (resultWord.equals(answer)) {
                    System.out.println("Correct!");
                } else {
                    System.out.print("'" + answer + "'" + "is wrong answer ;(. ");
                    System.out.println("Correct answer was" + "'" + resultWord + "'.\n"
                            + "Let's try again, " + newName + "!");
                    return;
                }
            }

            if (i == 2) {
                System.out.println("Congratulations, " + newName + "!");
            }
        }
        scanner.close();
    }
}
