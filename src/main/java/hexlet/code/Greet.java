package hexlet.code;

import java.util.Scanner;

public class Greet {
    public static void greeting() {
        Scanner name = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        var newName = name.next();
        System.out.println("Hello, " + newName + "!");
        name.close();
    }
}
