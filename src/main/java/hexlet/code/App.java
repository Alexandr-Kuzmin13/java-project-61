package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.nio.charset.Charset;
import java.util.Scanner;

public class App {
    static final int NULL = 0;
    static final int ONE = 1;
    static final int TWO = 2;
    static final int THREE = 3;
    static final int FOUR = 4;
    static final int FIVE = 5;
    static final int SIX = 6;
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
        switch (choose) {
            case NULL -> System.out.println("Goodbye!");
            case ONE -> Greet.greeting();
            case TWO -> Even.engine();
            case SIX -> Prime.engine();
            case THREE -> Calc.engine();
            case FOUR -> GCD.engine();
            case FIVE -> Progression.engine();
            default -> throw new IllegalStateException("Unexpected value: " + choose);
        }
        scanner.close();
    }

}
