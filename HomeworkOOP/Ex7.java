
//Using the Student class, create a list of students with different grades.
// Find and display the top 3 students based on their grades.


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex7 {
    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        students.add(new Student("Maria", 8.40));
        students.add(new Student("Alex", 7.25));
        students.add(new Student("Maria",8.40));
        students.add(new Student("Lavinia", 9.80));

        for (Student newstudent : students) {
            System.out.println(newstudent);


        }

        Set<Student> treeSetStudent = new TreeSet<>();
        System.out.println("Printing student grades in ascending order: ");

        treeSetStudent.add(new Student("Maria", 8.40));
        treeSetStudent.add(new Student("Alex", 7.25));
        treeSetStudent.add(new Student("Lavinia", 9.80));

        for (Student student : treeSetStudent) {
            System.out.println(student);
        }


    }



}
