package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Game;

import java.util.Random;

public final class Progression implements Game {
    private static final int SIZE_ARRAY = 10;
    private static final int SIZE_RANDOM1 = 9;
    private static final int SIZE_RANDOM2 = 100;

    public static void engine() {
        Engine.allEngine(new Progression());
    }

    @Override
    public void taskGame() {
        System.out.println("What number is missing in the progression?");
    }

    @Override
    public String generate() {
        Random rnd = new Random();
        int element = 1 + rnd.nextInt(SIZE_RANDOM2);
        var step = 1 + rnd.nextInt(SIZE_RANDOM1);
        var missingNumber = rnd.nextInt(SIZE_RANDOM1);
        String[] progress = new String[SIZE_ARRAY];
        progress[0] = String.valueOf(element);
        for (var k = 1; k < SIZE_ARRAY; k++) {
            element = element + step;
            progress[k] = String.valueOf(element);
        }
        progress[missingNumber] = "..";
        return String.join(" ", progress);
    }

    @Override
    public String answer(String number) {
        String[] progress = number.split(" ");
        for (var k = 0; k < SIZE_ARRAY; k++) {
            if (progress[k].equals("..")) {
                return String.valueOf((Integer.parseInt(progress[k + 1]) + Integer.parseInt(progress[k - 1])) / 2);
            }
        }
        return null;
    }
}
