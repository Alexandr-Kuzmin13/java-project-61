package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;

import java.util.Random;

public final class Prime implements Game {
    private static final int SIZE_RANDOM = 100;

    public static void engine() {
        Engine.allEngine(new Prime());
    }

    @Override
    public void taskGame() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    @Override
    public String generate() {
        Random rnd = new Random();
        return String.valueOf(rnd.nextInt(SIZE_RANDOM));
    }

    @Override
    public String answer(String number) {
        String result = null;
        if (Integer.parseInt(number) < 2) {
            result = "no";
        }
        for (var j = 2; j < Integer.parseInt(number); j++) {
            if (Integer.parseInt(number) % j == 0) {
                result = "no";
                break;
            } else {
                result = "yes";
            }
        }
        return result;
    }
}
