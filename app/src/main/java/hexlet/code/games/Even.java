package hexlet.code.games;

import java.util.Random;

public final class Even implements Game {
    private static final int SIZE_RANDOM = 100;

    @Override
    public String getTask() {
        return  "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    @Override
    public String[] generateAnswer() {
        String[] values = new String[2];

        Random rnd = new Random();
        var newRandom = rnd.nextInt(SIZE_RANDOM);
        values[0] = String.valueOf(newRandom);
        values[1] = (newRandom % 2 == 0) ? "yes" : "no";

        return values;
    }
}
