package streams;

import support_elements.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test2_Filter {
    public static void main(String[] args) {

        ArrayList<Student> list = Student.listOfStudents();
        List<Student> list2 = list.stream().filter(el -> el.getAge() > 22 && el.getAvgGrade() < 7.0)
                .collect(Collectors.toList());
        System.out.println(list+"\n"+list2);
    }
}
