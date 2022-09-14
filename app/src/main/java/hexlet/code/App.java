package hexlet.code;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                0 - Exit""");
        System.out.print("Your choice: ");
        var first = number.nextInt();
        System.out.println(" ");
        switch (first) {
            case 1 -> Greet.greeting();
            case 2 -> Even.gameEven();
            case 3 -> Calc.gameCalc();
            case 4 -> GCD.gameGCD();
        }

    }

}
