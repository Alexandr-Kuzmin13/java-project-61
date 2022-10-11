package hexlet.code.games;

import java.util.Random;

public final class Calc implements Game {
    private static final int OPERATOR_TYPE = 3;
    private static final int NUMBER_RANGE_ONE = 10;
    private static final int NUMBER_RANGE_TWO = 100;
    private static final String[] OPERATORS = {"+", "-", "*"};

    @Override
    public String getTask() {
        return  "What is the result of the expression?";
    }

    @Override
    public String[] generateAnswer() {
        String[] values = new String[2];

        Random rnd = new Random();
        var firstNumber = rnd.nextInt(NUMBER_RANGE_ONE);
        var secondNumber = rnd.nextInt(NUMBER_RANGE_TWO);
        String operator = OPERATORS[rnd.nextInt(OPERATOR_TYPE)];
        values[0] = firstNumber + " " + operator + " " + secondNumber;

        switch (operator) {
            case "+" -> values[1] = String.valueOf(firstNumber + secondNumber);
            case "-" -> values[1] = String.valueOf(firstNumber - secondNumber);
            case "*" -> values[1] = String.valueOf(firstNumber * secondNumber);
            default -> throw new RuntimeException("Unknown operator: " + operator);
        }

        return values;
    }
}
