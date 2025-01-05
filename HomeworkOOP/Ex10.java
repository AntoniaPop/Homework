//Create a Set<String> to store student names.
// Add several names, some of them duplicates, and verify that the set only keeps unique names.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex10 {
    public static void main(String[] args) {

        Set <String> students = new HashSet<>();
        students.add("Alin");
        students.add("Marius");
        students.add("Laura");
        students.add("Maria");
        students.add("Marius");
        students.add("Laura");
        students.add("Antonia");
        students.add("Alin");

        for (String student : students) {
            System.out.println(student);
        }

        //sorting in alphabetical order

        Set<String> studentnames = new TreeSet<>();
        studentnames.addAll(students);


        System.out.println("Printing names in alphabetical unique order: ");
        for (String studentname : studentnames) {
            System.out.println(studentname);
        }

    }
}
