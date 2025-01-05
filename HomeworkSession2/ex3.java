package homework2Antonia;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        System.out.println("1- Add");
        System.out.println("2- Substract");
        System.out.println("3- Multiply");
        System.out.println("4- Divide");
        System.out.println("Choose Operator: ");

        Scanner scanner = new Scanner(System.in);
        int operator = scanner.nextInt();
        System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();

        int result = 0;
        switch (operator) {
            case 1:
                result = number1 + number2;
                break;
            case 2:
                result = number1 - number2;
                break;
            case 3:
                result = number1 * number2;
                break;
            case 4:
                result = number1 / number2;
            default:
                System.out.println("Incorrect operator.");

        }
        System.out.println("The result is: " + result);


    }
}
