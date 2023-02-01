package chapter14;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PlayGround14 {

//    private static int outerField = 5;

    public static void main(String[] args) {
//        int val = 30;   // 상수취급
//        int i = 10;     // 상수취급
//
//        MyFunction function = (n) -> {
//            System.out.println(++n);        // 가능
//            System.out.println(i);
//            System.out.println(val);      // 에러, 메서드 내부에 존재하는 지역변수는 변경 불가
//            System.out.println(++PlayGround14.outerField);  // 가능, 메서드 외부에 존재하는 변수는 변경가능
//        };
//
//        function.f(i);


        List<StudentTest> students = List.of(
                new StudentTest("김제동", 3, 100),
                new StudentTest("이제동", 1, 50),
                new StudentTest("박제동", 2, 100),
                new StudentTest("황현", 1, 90),
                new StudentTest("황제동", 3, 90),
                new StudentTest("김밥", 3, 90)
        );

        students.stream()
                .sorted(Comparator.comparing((StudentTest s) -> s.getBan())     // 반으로 오름차순 정렬
                        .thenComparing(s -> s.getScore() * -1)                  // 점수로 내림차순 정렬
                        .thenComparing(s -> s.getName()))                       // 이름으로 오름차순 정렬
                .forEach(System.out::println);

        Optional<String> optStr = Optional.ofNullable("Hi");
        Optional<String> optNull = Optional.ofNullable(null);
        Optional<String> empty = Optional.empty();

        System.out.println("str = " + optStr);
        System.out.println("o = " + optNull);
        System.out.println("empty = " + empty);

        String s1 = optStr.get();
        String s2 = optStr.orElse("값없음");
        String s3 = optNull.orElse("값없음");

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        optStr.ifPresent(System.out::println);


        List<String> names = students.stream().map(s -> s.getName())
                .collect(Collectors.toList());                                  // List로 반환

        ArrayList<String> list = students.stream().map(s -> s.getName())
                .collect(Collectors.toCollection(ArrayList::new));              // ArrayList로 반환


        String collectedNames = students.stream().map(s -> s.getName()).collect(Collectors.joining());

        String collectedNamesWithComma = students.stream().map(s -> s.getName()).collect(Collectors.joining(", "));

        String collectWithFix = students.stream().map(s -> s.getName()).collect(Collectors.joining(", ", "[", "]"));
        System.out.println("구분자 없음 : " + collectedNames);
        System.out.println("구분자만 있음 : " + collectedNamesWithComma);
        System.out.println("구분자와 접두사, 접미사 있음 : " + collectWithFix);


    }
}

class StudentTest {
    String name;
    int ban;
    int score;

    public StudentTest(String name, int ban, int score) {
        this.name = name;
        this.ban = ban;
        this.score = score;
    }

    String getName() {
        return name;
    }

    int getBan() {
        return ban;
    }

    int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "StudentTest{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", score=" + score +
                '}';
    }
}

@FunctionalInterface
interface MyFunction {
    void f(int i);
}
