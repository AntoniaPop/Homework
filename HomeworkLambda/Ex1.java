//Sort a list of integers in ascending order using an anonymous class for the comparator.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(10);
        myList.add(1);
        myList.add(4);
        myList.add(25);

        Collections.sort(myList, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        });

        System.out.println(myList);


    }


}
