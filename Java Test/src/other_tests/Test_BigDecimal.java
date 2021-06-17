package other_tests;

import support_elements.Student;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

import static java.math.BigDecimal.ROUND_HALF_UP;
import static java.math.RoundingMode.HALF_UP;

public class Test_BigDecimal {
    public static void main(String[] args) throws Exception{
        Map<Student, Double> map = new HashMap<>();
        List<Student> list = Student.listOfStudents();
        list.stream().forEach(el -> map.put(el, new BigDecimal(Math.random()*10).setScale(2, ROUND_HALF_UP).doubleValue()));
        System.out.println(map);

    }
}
