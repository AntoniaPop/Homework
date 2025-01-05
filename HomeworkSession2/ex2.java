package homework2Antonia;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");


            int a = scanner.nextInt();

            if (a % 2 == 0 && a % 3 == 0) {
                System.out.println("The number is divisible by both 2 and 3");
                break;
            } else if (a % 2 == 0 && a % 3 != 0) {
                System.out.println("The number is divisible by 2, but not divisible by 3");
            } else if (a % 2 != 0 && a % 3 == 0) {
                System.out.println("The number is divisible by 3, but not divisible by 2");
            } else {
                System.out.println("The number is not divisible by either.");
            }

        }




    }
}
