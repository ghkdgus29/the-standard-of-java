package chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SpeedTest {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(2000000);
        LinkedList<Integer> ll = new LinkedList<>();

        System.out.println("= 순차적으로 추가 =");
        System.out.println("ArrayList : " + addInOrder(al));
        System.out.println("LinkedList : " + addInOrder(ll));

        System.out.println("= 중간에 추가 =");
        System.out.println("ArrayList : " + addMiddle(al));
        System.out.println("LinkedList : " + addMiddle(ll));

        System.out.println("= 중간에 삭제 =");
        System.out.println("ArrayList : " + removeMiddle(al));
        System.out.println("LinkedList : " + removeMiddle(ll));

        System.out.println("= 순차적으로 삭제 =");
        System.out.println("ArrayList : " + removeInOrder(al));
        System.out.println("LinkedList : " + removeInOrder(ll));

    }

    private static long addInOrder(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long addMiddle(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add(500, 7);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long removeMiddle(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long removeInOrder(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = list.size() - 1; i >= 0; i--) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
