package streams;

import java.util.stream.Stream;

public class Test8_Distinct {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5, 1,2,3);
        stream.distinct().forEach(System.out::print);//12345
    }
}
