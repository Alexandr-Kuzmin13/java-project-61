package hexlet.code;

import java.util.Random;

public class GCD {
    public static int gameGCD() {

        Random rnd = new Random();
        final int sizeRandom = 100;
        var x1 = 1 + rnd.nextInt(sizeRandom);
        var x2 = 1 + rnd.nextInt(sizeRandom);
        System.out.println("Question: " + x1 + " " + x2);
        var newX1 = x1;
        if (x2 > x1) {
            x1 = x2;
            x2 = newX1;
        }
        var result = 0;
        for (var j = x2; j > 0; j--) {
            if (x1 % j == 0 && x2 % j == 0) {
                result = j;
                break;
            }
        }
        return result;
    }
}
