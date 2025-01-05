package homework2Antonia;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {

        System.out.println("Enter a letter: ");
        Scanner scanner = new Scanner(System.in);

        String letter = scanner.next();

        switch (letter) {
            case "a", "e", "i", "o", "u":
                System.out.println("You entered a vowel.");
                break;
            default :
                System.out.println("You entered a consonant.");

        }
    }
}
