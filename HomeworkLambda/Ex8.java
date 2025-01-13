//Use the built-in Predicate<Integer> functional interface to check if a number is even.

import java.util.function.Predicate;

public class Ex8 {
    public static void main(String[] args) {

        Predicate<Integer> isEven = a -> a % 2 == 0;

        boolean firstNumber = isEven.test(8);
        boolean secondNumber = isEven.test(124);
        boolean thirdNumber = isEven.test(13);

        System.out.println(firstNumber);
        System.out.println(thirdNumber);
        System.out.println(secondNumber);

    }
}
