package chapter14;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex4 {
    public static void main(String[] args) {
        String[] strArr = {"aaa", "bb", "c", "dddd"};
        int count = Stream.of(strArr)
                .mapToInt(s -> s.length())
                .sum();

        System.out.println(count);
    }
}
