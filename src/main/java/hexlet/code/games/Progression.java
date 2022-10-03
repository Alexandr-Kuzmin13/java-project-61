package hexlet.code.games;

import java.util.Random;

public final class Progression implements Game {
    private static final int SIZE_ARRAY = 10;
    private static final int SIZE_RANDOM1 = 9;
    private static final int SIZE_RANDOM2 = 100;

    @Override
    public String getTask() {
        return  "What number is missing in the progression?";
    }

    @Override
    public String[] generateAnswer() {
        String[] meaning = new String[2];

        Random rnd = new Random();
        var element = 1 + rnd.nextInt(SIZE_RANDOM2);
        var step = 1 + rnd.nextInt(SIZE_RANDOM1);
        var missingNumber = rnd.nextInt(SIZE_RANDOM1);
        String[] progress = new String[SIZE_ARRAY];
        progress[0] = String.valueOf(element);
        for (var k = 1; k < SIZE_ARRAY; k++) {
            element = element + step;
            progress[k] = String.valueOf(element);
        }
        progress[missingNumber] = "..";
        meaning[0] = String.join(" ", progress);
        String[] progressAfter = meaning[0].split(" ");
        for (var k = 0; k < SIZE_ARRAY; k++) {
            if (progressAfter[k].equals("..")) {
                meaning[1] = String.valueOf((Integer.parseInt(progressAfter[k + 1]) + Integer.parseInt(progressAfter[k - 1])) / 2);
            }
        }

        return meaning;
    }
}
