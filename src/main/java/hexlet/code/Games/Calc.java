package hexlet.code.games;

import java.util.Random;

public class Calc {
    public static int gameCalc() {

        Random rnd = new Random();
        final int operatorType = 3;
        final int number1SizeRandom = 10;
        final int number2SizeRandom = 100;
        var x1 = rnd.nextInt(number1SizeRandom);
        var x2 = rnd.nextInt(number2SizeRandom);
        int x3 = rnd.nextInt(operatorType);
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
        return result;
    }
}
