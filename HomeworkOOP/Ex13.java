//Create two Set<Integer> objects with some common elements.
// Write methods to find the union, intersection, and difference of these sets.

import java.util.HashSet;
import java.util.Set;

public class Ex13 {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        System.out.println("Printing first set: " + set1);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        System.out.println("Printing second set: " + set2);

        System.out.println("Union: " + union(set1, set2));
        System.out.println("Intersection: " + intersection(set1, set2));
        System.out.println("Difference 1 (set1 - set2): " + findDifference(set1, set2));
        System.out.println("Difference 2 (set2 - set1): "+ findDifference2(set1, set2));

    }

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;

    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }

    public static Set<Integer> findDifference(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        return difference;
    }

    public static Set<Integer> findDifference2(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> difference = new HashSet<>(set2);
        difference.removeAll(set1);
        return difference;
    }

}
