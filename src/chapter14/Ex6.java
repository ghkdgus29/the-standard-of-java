package chapter14;


import java.util.Random;
import java.util.stream.IntStream;

public class Ex6 {
    public static void main(String[] args) {
        new Random()
                .ints(1, 46)
                .limit(6)
                .sorted()
                .forEach(n -> System.out.println(n));
    }
}
