package streams;

import support_elements.Student;

import javax.management.openmbean.SimpleType;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test17_MapToInt {
    public static void main(String[] args) {
        List<Student> list = Student.listOfStudents();

        //4, 3, 5, 2, 1
        List<Integer> courses = list.stream().mapToInt(e -> e.getCourse())
                .boxed()//int -> Integer
                .collect(Collectors.toList());


        //4, 3, 5, 2, 1
        int[] coursesArray = list.stream().mapToInt(e -> e.getCourse())
                .toArray();

        //15
        int sum = list.stream().mapToInt(e -> e.getCourse()).sum();

        //5
        int max = list.stream().mapToInt(e -> e.getCourse()).max().getAsInt();

        //1
        int min = list.stream().mapToInt(e -> e.getCourse()).min().getAsInt();

        //avgAge = 22.4
        double avgAge = list.stream().mapToInt(e -> e.getAge()).average().getAsDouble();
    }
}
