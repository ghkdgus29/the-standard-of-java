package chapter14;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Ex5 {
    public static void main(String[] args) {
        String[] strArr = {"aaa", "bb", "c", "dddd"};

        Integer ans = Stream.of(strArr)
                .max(Comparator.comparingInt(str -> str.length()))
                .map(str -> str.length()).get();
        System.out.println(ans);
    }
}
