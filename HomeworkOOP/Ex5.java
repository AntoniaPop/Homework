
//Populate a List<Integer>, then convert each integer to its string representation and store it in a new List<String>.

import java.util.ArrayList;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(11);
        integerList.add(12);
        integerList.add(13);
        integerList.add(14);

        System.out.println("List of integers: " + integerList);

        List<String> stringList = new ArrayList<>();

        for (Integer value : integerList) {
            stringList.add(value.toString());
        }

        System.out.println("List of strings: " + stringList);
    }
}
