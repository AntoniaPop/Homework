//Define a functional interface Transformer<T> with a method T transform(T input)
// and use a lambda to reverse a string.

@FunctionalInterface
interface Transformer<T> {
    T transform(T input);
}

public class Ex10 {
    public static void main(String[] args) {

        Transformer<String> reversedString = input -> new StringBuilder(input).reverse().toString();

        String initial = "Hello, Antonia!";
        String reversed = reversedString.transform(initial);

        System.out.println(initial);
        System.out.println(reversed);

    }
}



