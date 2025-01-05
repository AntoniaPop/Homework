package homework2Antonia;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int i = scanner.nextInt();

        if(i > 0) {
            System.out.println("The number is positive.");
        } else if ( i < 0 ) {
            System.out.println("The number is negative. ");

        } else {
            System.out.println("The number is 0");

        }
    }



}
