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
        String[] values = new String[2];

        Random rnd = new Random();
        var element = 1 + rnd.nextInt(SIZE_RANDOM2);
        var step = 1 + rnd.nextInt(SIZE_RANDOM1);
        var missingNumber = rnd.nextInt(SIZE_RANDOM1);
        String[] progress = new String[SIZE_ARRAY];
        progress[0] = String.valueOf(element);

        for (var k = 1; k < SIZE_ARRAY; k++) {
            element = element + step;
            progress[k] = String.valueOf(element);
            if (k == missingNumber) {
                values[1] = progress[k];
                progress[k] = "..";
            }
        }

        values[0] = String.join(" ", progress);

        return values;
    }
}
