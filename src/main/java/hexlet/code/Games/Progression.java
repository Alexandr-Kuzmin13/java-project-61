package hexlet.code.games;

import java.util.Random;

public class Progression {
    public static int gameProgression() {

        Random rnd = new Random();
        final int sizeRandom1 = 10;
        final int sizeRandom2 = 100;
        int firstNumberRandom = 1 + rnd.nextInt(sizeRandom2);
        var twoNumberRandom = 1 + rnd.nextInt(sizeRandom1);
        var threeNumberRandom = rnd.nextInt(sizeRandom1);
        final int sizeArray = 10;
        String[] progress = new String[sizeArray];
        progress[0] = firstNumberRandom + "";
        for (var k = 1; k < sizeArray; k++) {
            firstNumberRandom = firstNumberRandom + twoNumberRandom;
            progress[k] = firstNumberRandom + "";
        }
        var result = Integer.parseInt(progress[threeNumberRandom]);
        progress[threeNumberRandom] = "..";
        System.out.print("Question: ");
        for (var k = 0; k < sizeArray; k++) {
            System.out.print(progress[k] + " ");
        }
        System.out.println(" ");
        return result;
    }
}
