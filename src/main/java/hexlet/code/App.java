package hexlet.code;

import java.nio.charset.Charset;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, Charset.defaultCharset());
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        System.out.print("Your choice: ");
        var choose = scanner.nextInt();
        System.out.println(" ");
        final int numberNull = 0;
        final int numberOne = 1;
        final int numberTwo = 2;
        final int numberThree = 3;
        final int numberFour = 4;
        final int numberFive = 5;
        final int numberSix = 6;
        switch (choose) {
            case numberNull -> {
            }
            case numberOne -> Greet.greeting();
            case numberTwo -> Even.gameEven();
            case numberThree -> Calc.gameCalc();
            case numberFour -> GCD.gameGCD();
            case numberFive -> Progression.gameProgression();
            case numberSix -> Prime.gamePrime();
            default -> throw new IllegalStateException("Unexpected value: " + choose);
        }
        scanner.close();

    }

}
