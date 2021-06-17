package streams;

import support_elements.Student;
import support_elements.Utils;

import java.util.ArrayList;
import java.util.List;

public class Test3_ForEach {
    public static void main(String[] args) {
        List<Student> list = Student.listOfStudents();
        list.stream().forEach(el-> System.out.println(el));

        List<Integer> list2 = new ArrayList<>(List.of(2, 5, 8, 3, 16));
        list2.stream().forEach(Utils::multiplyBy2);
    }
}
