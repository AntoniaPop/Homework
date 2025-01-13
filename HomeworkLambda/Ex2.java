//Filter a list of strings to only include those starting with "A" using a lambda expression.

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Antonia");
        stringList.add("Maria");
        stringList.add("Alex");
        stringList.add("Carmen");
        stringList.add("Andrei");

        List<String> containAList = stringList.stream()
                .filter(s -> s.startsWith("A"))
                .toList();
        System.out.println(containAList);
    }
}
