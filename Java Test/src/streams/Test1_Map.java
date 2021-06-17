package streams;

import java.util.*;
import java.util.stream.Collectors;

public class Test1_Map {
    public static void main(String[] args) {
        List<String> list = List.of("privet", "kak dela?","poka", "OK");

        List <Integer> list2 = list.stream().map(s -> s.length()).collect(Collectors.toList());

//        System.out.println(list+"\n"+list2);

        int[] array = {2, 5, 8, 9, 10, 15};
        array = Arrays.stream(array).map(el
                -> {if (el%3==0)
                        el = el/3;
                    return el;
                    }).toArray();

//        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>(Set.of("privet", "kak dela?", "OK", "poka"));
        Set<Integer> set2 = set.stream().map(s-> s.length()).collect(Collectors.toSet());
        List<Integer> list3 = set.stream().map(s-> s.length()).collect(Collectors.toList());


//        System.out.println(set + "\n" +set2+"\n"+ list3);

        Set<Integer> set3 = list.stream().map(s-> s.length()).collect(Collectors.toSet());

        System.out.println(set3);

    }
}
