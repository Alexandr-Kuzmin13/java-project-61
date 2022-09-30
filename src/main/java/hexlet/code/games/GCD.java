package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;

import java.util.Random;

public final class GCD implements Game {
    private static final int SIZE_RANDOM1 = 9;
    private static final int SIZE_RANDOM2 = 99;


    public static void engine() {
        Engine.allEngine(new GCD());
    }

    @Override
    public void taskGame() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    @Override
    public String generate() {
        Random rnd = new Random();
        var x1 = 1 + rnd.nextInt(SIZE_RANDOM1);
        var x2 = 1 + rnd.nextInt(SIZE_RANDOM2);
        return x1 + " " + x2;
    }

    @Override
    public String answer(String number) {
        String result = null;
        var x1 = Integer.parseInt(number.substring(0, 1));
        var x2 = Integer.parseInt(number.substring(2));
        var newX1 = x1;
        if (x2 > x1) {
            x1 = x2;
            x2 = newX1;
        }
        for (var j = x2; j > 0; j--) {
            if (x1 % j == 0 && x2 % j == 0) {
                result = String.valueOf(j);
                break;
            }
        }
        return result;
    }
}
