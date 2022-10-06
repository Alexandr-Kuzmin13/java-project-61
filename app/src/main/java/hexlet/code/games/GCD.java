package hexlet.code.games;

import java.util.Random;

public final class GCD implements Game {
    private static final int SIZE_RANDOM1 = 9;
    private static final int SIZE_RANDOM2 = 99;

    @Override
    public String getTask() {
        return  "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String[] generateAnswer() {
        String[] values = new String[2];

        Random rnd = new Random();
        var firstNumber = 1 + rnd.nextInt(SIZE_RANDOM1);
        var secondNumber = 1 + rnd.nextInt(SIZE_RANDOM2);
        values[0] = firstNumber + " " + secondNumber;
        var result = 0;
        var newX1 = firstNumber;
        if (secondNumber > firstNumber) {
            firstNumber = secondNumber;
            secondNumber = newX1;
        }
        for (var j = secondNumber; j > 0; j--) {
            if (firstNumber % j == 0 && secondNumber % j == 0) {
                result = j;
                break;
            }
        }
        values[1] = String.valueOf(result);

        return values;
    }
}
