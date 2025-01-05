//Create a TreeSet<Integer> and add random integers. Verify that the integers are stored in ascending order.

import java.util.Set;
import java.util.TreeSet;

public class Ex8 {
    public static void main(String[] args) {

        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(287);
        treeSet.add(-25);
        treeSet.add(-45);
        treeSet.add(10);
        treeSet.add(34);

        for (Integer i : treeSet) {
            System.out.println(i);
        }

    }
}
