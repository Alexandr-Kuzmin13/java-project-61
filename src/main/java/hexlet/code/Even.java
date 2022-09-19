package hexlet.code;

import java.util.Random;

public class Even {
    public static String gameEven() {

        Random rnd = new Random();
        final int numberSizeRandom = 100;
        var x = rnd.nextInt(numberSizeRandom);
        String result = "";
        if (x % 2 == 0) {
            result = "yes";
        } else {
            result = "no";
        }
        System.out.println("Question: " + x);
        return result;
    }
}
