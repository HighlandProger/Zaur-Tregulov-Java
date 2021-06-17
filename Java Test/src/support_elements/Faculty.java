package support_elements;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name){
        this.name = name;
        this.studentsOnFaculty = new ArrayList<>();
    }

    public void addStudentOnFaculty(Student student){
        studentsOnFaculty.add(student);
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }
}
