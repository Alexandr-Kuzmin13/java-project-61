package hexlet.code.games;

import java.util.Random;

public class Prime {
    public static String gamePrime() {

        Random rnd = new Random();
        final int sizeRandom = 100;
        int x1 = rnd.nextInt(sizeRandom);
        System.out.println("Question: " + x1);
        var result = "";
        if (x1 < 2) {
            result = "no";
        }
        for (var j = 2; j < x1; j++) {
            if (x1 % j == 0) {
                result = "no";
                break;
            } else {
                result = "yes";
            }
        }
        return result;
    }
}
