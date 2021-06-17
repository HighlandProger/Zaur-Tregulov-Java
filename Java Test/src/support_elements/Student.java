package support_elements;

import java.util.ArrayList;

public class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public static ArrayList<Student> listOfStudents(){
        ArrayList<Student> list = new ArrayList<>();

        Student st1 = new Student("Ivan", 'm', 23, 4, 6.8);
        Student st2 = new Student("Nina", 'f', 22, 3, 7.5);
        Student st3 = new Student("Petr", 'm', 25, 5, 7.2);
        Student st4 = new Student("Andrey", 'm', 22, 2, 5.8);
        Student st5 = new Student("Yulia", 'f', 20, 1, 7.0);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        return list;
    }


}
