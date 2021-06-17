package streams;

import support_elements.Student;

import java.util.List;

public class Test13_FindFirst {
    public static void main(String[] args) {

        List<Student> list = Student.listOfStudents();

        Student firstStudent = list.stream().filter(el -> el.getSex()=='m').findFirst().get();

        System.out.println(firstStudent);
    }
}
