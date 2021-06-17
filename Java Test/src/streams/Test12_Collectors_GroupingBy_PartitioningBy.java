package streams;

import support_elements.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test12_Collectors_GroupingBy_PartitioningBy {
    public static void main(String[] args) {
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

        //GroupingBy---------------------------------------------------------------
        Map<Integer, List<Student>> map = list.stream().map(el-> {
            el.setName(el.getName().toUpperCase());
            return el;
        }).collect(Collectors.groupingBy(el-> el.getCourse()));

        for (Map.Entry<Integer, List<Student>> entry: map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue().toString());
        }
        //--------------------------------------------------------------------------

        //PartitioningBy------------------------------------------------------------
        Map<Boolean, List<Student>> map2 = list.stream().collect(Collectors.partitioningBy(el
                -> el.getAvgGrade()>7.0));

        for (Map.Entry<Boolean, List<Student>> entry: map2.entrySet()){
            System.out.println("avg grade more than 7.0 ("+entry.getKey() + "): " + entry.getValue().toString());
        }
        //---------------------------------------------------------------------------
    }

}
