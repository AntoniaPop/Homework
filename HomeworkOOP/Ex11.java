//Using the Student class, add students to a TreeSet<Student> based on their grade.
//Display the students in ascending order of grades.

import java.util.Set;
import java.util.TreeSet;

public class Ex11 {
    public static void main(String[] args) {

        Set<Student> students = new TreeSet<>();

        students.add(new Student("Kevin", 7.80));
        students.add(new Student("Gina",8.20));
        students.add(new Student("Lara", 9.50));
        students.add(new Student("Josh", 7.25));

        System.out.println("Printing students in ascending order of grades: ");
        for (Student student : students) {
            System.out.println(student);
        }


    }
}
