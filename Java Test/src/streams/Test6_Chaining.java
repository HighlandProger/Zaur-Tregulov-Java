package streams;

import support_elements.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test6_Chaining {
    public static void main(String[] args) {
        int [] array = {2,4,13,6,23,6,8};

        int result = Arrays.stream(array).filter(e -> e%2==0)// 2, 4, 6, 6, 8
                .map(e -> {if (e%3==0) {e = e/3;} return e;}).//2, 4, 2, 2, 8
                reduce((accum, el) -> accum+el).getAsInt();//sum

        System.out.println(result);

        List<Student> list = Student.listOfStudents();

        list.stream().map(el ->
        {
            el.setName(el.getName().toUpperCase());
            return el;
        })// All letters to UpperCase
                .filter(el -> el.getSex()=='m')// Only Man
                .sorted(Comparator.comparing(Student::getAge))// sorting by age
                .forEach(el -> System.out.println(el));// Terminal method (print result)

    }
}
