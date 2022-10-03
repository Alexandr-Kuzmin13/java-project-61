package hexlet.code.games;

import java.util.Random;

public final class Calc implements Game {
    private static final int OPERATOR_TYPE = 3;
    private static final int SIZE_RANDOM1 = 10;
    private static final int SIZE_RANDOM2 = 100;
    private static final char[] OPERATORS = {'+', '-', '*'};

    @Override
    public String getTask() {
        return  "What is the result of the expression?";
    }

    @Override
    public String[] generateAnswer() {
        String[] meaning = new String[2];

        Random rnd = new Random();
        var firstNumber = rnd.nextInt(SIZE_RANDOM1);
        var secondNumber = rnd.nextInt(SIZE_RANDOM2);
        char operator = OPERATORS[rnd.nextInt(OPERATOR_TYPE)];
        meaning[0] = String.valueOf(firstNumber) + operator + secondNumber;

        var firstNumberAfter = Integer.parseInt(meaning[0].substring(0, 1));
        var secondNumberAfter = Integer.parseInt(meaning[0].substring(2));
        switch (meaning[0].charAt(1)) {
            case '+' -> meaning[1] = String.valueOf(firstNumberAfter + secondNumberAfter);
            case '-' -> meaning[1] = String.valueOf(firstNumberAfter - secondNumberAfter);
            case '*' -> meaning[1] = String.valueOf(firstNumberAfter * secondNumberAfter);
            default -> throw new RuntimeException("Unknown operator: " + meaning[0].charAt(1));
        }

        return meaning;
    }
}
