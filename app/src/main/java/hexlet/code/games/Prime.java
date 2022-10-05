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
        String[] values = new String[2];

        Random rnd = new Random();
        var newRandom = rnd.nextInt(SIZE_RANDOM);
        values[0] = String.valueOf(newRandom);
        String result = null;
        if (newRandom < 2) {
            result = "no";
        }
        for (var j = 2; j < newRandom; j++) {
            if (newRandom % j == 0) {
                result = "no";
                break;
            } else {
                result = "yes";
            }
        }
        values[1] = result;

        return values;
    }
}
