//Use a lambda expression with Function<String, Integer> to find the length of a string.

import java.util.Scanner;
import java.util.function.Function;

public class Ex6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = sc.nextLine();

        Function<String, Integer> getStringLength = string -> string.length();

        Integer stringLength = getStringLength.apply(s);
        System.out.println("Length of string: " + stringLength);

    }
}
