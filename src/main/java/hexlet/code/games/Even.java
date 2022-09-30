package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;

import java.util.Random;

public final class Even implements Game {
    private static final int SIZE_RANDOM = 100;

    public static void engine() {
        Engine.allEngine(new Even());
    }

    @Override
    public void taskGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
    @Override
    public String generate() {
        Random rnd = new Random();
        return String.valueOf(rnd.nextInt(SIZE_RANDOM));
    }
    @Override
    public String answer(String number) {
        String result;
        if (Integer.parseInt(number) % 2 == 0) {
            result = "yes";
        } else {
            result = "no";
        }
        return result;
    }
}
