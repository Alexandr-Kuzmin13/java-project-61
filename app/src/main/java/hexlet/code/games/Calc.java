package hexlet.code.games;

import java.util.Random;

public final class Calc implements Game {
    private static final int OPERATOR_TYPE = 3;
    private static final int SIZE_RANDOM1 = 10;
    private static final int SIZE_RANDOM2 = 100;
    private static final String[] OPERATORS = {"+", "-", "*"};

    @Override
    public String getTask() {
        return  "What is the result of the expression?";
    }

    @Override
    public String[] generateAnswer() {
        String[] values = new String[2];

        Random rnd = new Random();
        var firstNumber = rnd.nextInt(SIZE_RANDOM1);
        var secondNumber = rnd.nextInt(SIZE_RANDOM2);
        String operator = OPERATORS[rnd.nextInt(OPERATOR_TYPE)];
        values[0] = firstNumber + operator + secondNumber;

        if (operator.equals("+")) {
            values[1] = String.valueOf(firstNumber + secondNumber);
        } else if (operator.equals("-")) {
            values[1] = String.valueOf(firstNumber - secondNumber);
        } else {
            values[1] = String.valueOf(firstNumber * secondNumber);
        }

        return values;
    }
}
