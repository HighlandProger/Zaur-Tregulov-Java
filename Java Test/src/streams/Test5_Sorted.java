package streams;

import support_elements.Student;

import java.util.*;
import java.util.stream.Collectors;

public class Test5_Sorted {
    public static void main(String[] args) {
        int [] array = {1, 3, 2, 4,6,2,1,};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));


        List<Student> list = Student.listOfStudents();
        list = list.stream().sorted(Comparator.comparing(Student::getAge)).collect(Collectors.toList());
        list = list.stream().sorted((st1, st2) -> {return st1.getAge()-st2.getAge();}).collect(Collectors.toList());
        System.out.println(list);
    }


}
