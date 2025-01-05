package Exercise5;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,5,98,45,23,71,12,42);
        int result = ListUtils.countGreaterThan(numbers, 45);
        System.out.println("Count of elements greater than 45: " + result);
    }
}
