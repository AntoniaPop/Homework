//Use a lambda with Predicate<Integer> to check if a number is greater than 10.

import java.util.Scanner;
import java.util.function.Predicate;

public class Ex3 {
    public static void main(String[] args) {


        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        Predicate<Integer> greaterThanTen = number -> number > 10;

        System.out.println("The number you entered is greater than 10. ---> " + greaterThanTen.test(a));


    }
}
