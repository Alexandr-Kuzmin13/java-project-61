package hexlet.code.games;

import java.util.Random;

public final class Prime implements Game {
    private static final int SIZE_RANDOM = 100;

    @Override
    public String getTask() {
        return  "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public String[] generateAnswer() {
        String[] meaning = new String[2];

        Random rnd = new Random();
        meaning[0] = String.valueOf(rnd.nextInt(SIZE_RANDOM));
        String result = null;
        if (Integer.parseInt(meaning[0]) < 2) {
            result = "no";
        }
        for (var j = 2; j < Integer.parseInt(meaning[0]); j++) {
            if (Integer.parseInt(meaning[0]) % j == 0) {
                result = "no";
                break;
            } else {
                result = "yes";
            }
        }
        meaning[1] = result;

        return meaning;
    }
}
