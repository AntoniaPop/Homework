
//Create a List<Double> with positive and negative numbers.
// Write a method to remove all negative numbers from the list.

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {


        List<Double> doublelist = new ArrayList<>();
        doublelist.add(-10.8);
        doublelist.add(456.54);
        doublelist.add(-231.23);
        doublelist.add(45.05);

        System.out.println("Original number list: ");
        for (Double value : doublelist) {
            System.out.println("~ " + value);
        }

        removeNegativeNumbers(doublelist);
        System.out.println("Positive number list: " + doublelist);
    }



    public static void removeNegativeNumbers(List<Double> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) < 0) {
                list.remove(i);
            }
        }
    }


}
