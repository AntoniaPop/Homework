package homework2Antonia;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a number of integers: ");
        int n = scanner.nextInt();

        int i = 0;
        while (i <= n) {
            System.out.println("i= " + i);
            i++;
        }

    }
}
