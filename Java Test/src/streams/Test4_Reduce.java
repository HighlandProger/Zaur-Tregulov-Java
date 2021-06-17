package streams;

import java.util.ArrayList;
import java.util.List;

public class Test4_Reduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(5,  8, 2, 4, 3));

        int multiply = list.stream().reduce((accum, el) -> accum*el).get();
        System.out.println("start: "+multiply);

        List<String> list2 = new ArrayList<>(List.of("dorou",  "privet"));

        String subtract = list2.stream().reduce("",(accum, el) -> accum+el);
        System.out.println("start: "+subtract);

        int sum= 0;
        for (int i:list){
            sum+=i;
        }
        System.out.println(sum);
    }
}
