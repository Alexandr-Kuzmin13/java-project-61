package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.nio.charset.Charset;
import java.util.Scanner;

public class App {
    public static final int NULL_CODE = 0;
    public static final int GREET_CODE = 1;
    public static final int EVEN_CODE = 2;
    public static final int CALC_CODE = 3;
    public static final int GCD_CODE = 4;
    public static final int PROGRESSION_CODE = 5;
    public static final int PRIME_CODE = 6;
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
            case NULL_CODE -> System.out.println("Goodbye!");
            case GREET_CODE -> hexlet.code.Greet.greeting();
            case EVEN_CODE -> Engine.run(new Even());
            case PRIME_CODE -> Engine.run(new Prime());
            case CALC_CODE -> Engine.run(new Calc());
            case GCD_CODE -> Engine.run(new GCD());
            case PROGRESSION_CODE -> Engine.run(new Progression());
            default -> throw new IllegalStateException("Unexpected value: " + choose);
        }
        scanner.close();
    }

}
