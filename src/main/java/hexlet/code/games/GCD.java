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
        String[] meaning = new String[2];

        Random rnd = new Random();
        var firstNumber = 1 + rnd.nextInt(SIZE_RANDOM1);
        var secondNumber = 1 + rnd.nextInt(SIZE_RANDOM2);
        meaning[0] = firstNumber + " " + secondNumber;
        String result = null;
        var firstNumberAfter = Integer.parseInt(meaning[0].substring(0, 1));
        var secondNumberAfter = Integer.parseInt(meaning[0].substring(2));
        var newX1 = firstNumberAfter;
        if (secondNumberAfter > firstNumberAfter) {
            firstNumberAfter = secondNumberAfter;
            secondNumberAfter = newX1;
        }
        for (var j = secondNumberAfter; j > 0; j--) {
            if (firstNumberAfter % j == 0 && secondNumberAfter % j == 0) {
                result = String.valueOf(j);
                break;
            }
        }
        meaning[1] = result;

        return meaning;
    }
}
