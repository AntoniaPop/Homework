//Print all elements of a list using Consumer<String> and a lambda expression.

import java.util.List;
import java.util.function.Consumer;

public class Ex4 {
    public static void main(String[] args) {

        List<String> myList = List.of("Cake","Apple","Cherry","Cupcake","Biscuit");

        Consumer<String> printList = string -> System.out.println(string);

        myList.forEach(printList);


    }
}
