package mf.java8ws.talk.example07;

import java.util.stream.Stream;

public class ParallelStreams {

    public static long sequentialSum(long n) {
        return Stream.iterate(1L, i -> i + 1).limit(n).peek(System.out::println).reduce(0L, Long::sum);
    }

    public static long parallelSum(long n) {
        return Stream.iterate(1L, i -> i + 1).limit(n).peek(System.out::println).parallel().reduce(0L, Long::sum);
    }

}
