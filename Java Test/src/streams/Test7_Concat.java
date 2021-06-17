package streams;

import java.util.stream.Stream;

public class Test7_Concat {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
        Stream<Integer> stream2 = Stream.of(6,7,8,9,10);

        Stream<Integer> resultStream = Stream.concat(stream1, stream2);

        resultStream.forEach(System.out::print);//12345678910
    }

}
