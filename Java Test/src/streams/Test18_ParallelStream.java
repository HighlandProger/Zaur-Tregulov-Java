package streams;

import java.util.ArrayList;
import java.util.List;

public class Test18_ParallelStream {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>(List.of(10.0, 5.0, 1.0, 0.25));

        double sum1 = list.stream().reduce((accum, el) -> accum + el).get();
        double sum2 = list.parallelStream().reduce((accum, el) -> accum + el).get();
        System.out.println(sum1==sum2);

        double div1 = list.stream().reduce((accum, el) -> accum / el).get();
        double div2 = list.parallelStream().reduce((accum, el) -> accum / el).get();

        System.out.println(div1+" "+div2);

    }
}
