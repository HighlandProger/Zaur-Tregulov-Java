package streams;

import support_elements.Student;

import java.util.List;

public class Test16_Skip {
    public static void main(String[] args) {
        List<Student> list = Student.listOfStudents();

        list.stream().filter(e -> e.getSex()=='m').skip(2).forEach(System.out::println);
    }
}
