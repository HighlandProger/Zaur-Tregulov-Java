package streams;

import support_elements.Faculty;
import support_elements.Student;

import java.util.ArrayList;
import java.util.List;

public class Test11_FlatMap {
    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 'm', 23, 4, 6.8);
        Student st2 = new Student("Nina", 'f', 22, 3, 7.5);
        Student st3 = new Student("Petr", 'm', 25, 5, 7.2);
        Student st4 = new Student("Andrey", 'm', 22, 2, 5.8);
        Student st5 = new Student("Yulia", 'f', 20, 1, 7.0);


        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied mathematics");


        f1.addStudentOnFaculty(st1);
        f1.addStudentOnFaculty(st2);
        f1.addStudentOnFaculty(st3);

        f2.addStudentOnFaculty(st4);
        f2.addStudentOnFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>(List.of(f1, f2));
//        facultyList.add(f1);
//        facultyList.add(f2);

        facultyList.stream().flatMap(el -> el.getStudentsOnFaculty().stream()).forEach(e -> System.out.println(e.getName()));
    }
}
