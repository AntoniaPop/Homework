import java.util.Objects;

public class Student implements Comparable<Student>{

    private final String name;
    private final Double grade;

    public Student(String name, Double grade) {

        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if(o instanceof Student student){
            return student.name.equals(this.name)
                    && student.grade.equals(this.grade);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.length() + grade.intValue();
    }



    @Override
    public int compareTo(Student o) {
        return this.grade.compareTo(o.grade);
    }
}
