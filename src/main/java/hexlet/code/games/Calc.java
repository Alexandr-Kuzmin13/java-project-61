package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;

import java.util.Random;

public final class Calc implements Game {
    private static final int OPERATOR_TYPE = 3;
    private static final int SIZE_RANDOM1 = 10;
    private static final int SIZE_RANDOM2 = 100;
    private static final char[] OPERATORS = {'+', '-', '*'};

    public static void engine() {
        Engine.allEngine(new Calc());
    }

    @Override
    public void taskGame() {
        System.out.println("What is the result of the expression?");
    }

    @Override
    public String generate() {
        Random rnd = new Random();
        var firstNumber = rnd.nextInt(SIZE_RANDOM1);
        var secondNumber = rnd.nextInt(SIZE_RANDOM2);
        char operator = OPERATORS[rnd.nextInt(OPERATOR_TYPE)];
        return String.valueOf(firstNumber) + operator + secondNumber;
    }

    @Override
    public String answer(String number) {
        var firstNumber = Integer.parseInt(number.substring(0, 1));
        var secondNumber = Integer.parseInt(number.substring(2));

        return switch (number.charAt(1)) {
            case '+' -> String.valueOf(firstNumber + secondNumber);
            case '-' -> String.valueOf(firstNumber - secondNumber);
            case '*' -> String.valueOf(firstNumber * secondNumber);
            default -> throw new RuntimeException("Unknown operator: " + number.charAt(1));
        };
    }
}
