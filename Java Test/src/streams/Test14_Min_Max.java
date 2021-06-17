package streams;

import support_elements.Student;

import java.util.Comparator;
import java.util.List;

public class Test14_Min_Max {
    public static void main(String[] args) {
        List<Student> list = Student.listOfStudents();

        Student minStudent = list.stream().min((x,y) -> x.getAge()-y.getAge()).get();
        Student maxStudent = list.stream().max(Comparator.comparingDouble(Student::getAvgGrade)).get();

        System.out.println(minStudent);
        System.out.println(maxStudent);

    }
}
