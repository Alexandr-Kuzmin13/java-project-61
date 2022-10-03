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
        String[] meaning = new String[2];

        Random rnd = new Random();
        meaning[0] = String.valueOf(rnd.nextInt(SIZE_RANDOM));
        meaning[1] = (Integer.parseInt(meaning[0]) % 2 == 0) ? "yes" : "no";

        return meaning;
    }
}
