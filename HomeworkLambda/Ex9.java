//Use the built-in Consumer<String> functional interface to print strings prefixed with "Hello, ".

import java.util.List;
import java.util.function.Consumer;

public class Ex9 {
    public static void main(String[] args) {

        List<String> names = List.of("John", "Olivia", "Luca", "Nadia");

        Consumer<String> stringConsumer = name -> System.out.println("Hello, " + name);
        names.forEach(stringConsumer);

    }
}
