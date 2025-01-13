import java.util.Scanner;

/**
 * 5. Define a functional interface Calculator with a method int calculate(int a, int b). Use lambdas to
 * implement this interface for:
 *
 * Addition
 * Subtraction
 * Multiplication
 * Division
 * Test these implementations with various inputs.
 */

public class Ex5 {
    public static void main(String[] args) {

        Calculator add = (a, b) -> a + b;

        Calculator subtract = (a, b) -> a - b;

        Calculator multiply = (a, b) -> a * b;

        Calculator divide = (a, b) -> {
            if (b == 0) {
                System.out.println("Division by zero is not allowed!");
                return 0;
            }
            return a / b;
        };

        System.out.println("Addition: 10 + 6 = " + add.calculate(10, 6));
        System.out.println("Subtraction: 15 - 3 = " + subtract.calculate(15, 3));
        System.out.println("Multiplication: 20 * 5 = " + multiply.calculate(20, 5));
        System.out.println("Division: 6 / 3 = " + divide.calculate(6, 3));
        System.out.println("Division by zero: 12 / 0 = " + divide.calculate(12, 0));


    }

}
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
