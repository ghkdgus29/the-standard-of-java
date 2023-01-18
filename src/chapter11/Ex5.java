package chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student implements Comparable{
    String name;
    int ban;
    int no;
    int kor, eng, math;

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
    }

    public String toString() {
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math
                + "," + getTotal() + "," + getAverage();
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Student2) {
            Student2 s = (Student2) o;
            return this.name.compareTo(s.name);
        }
        return -1;
    }
}

public class Ex5 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Student2("홍길동", 1, 1, 100, 100, 100));
        list.add(new Student2("남궁성", 1, 2, 90, 70, 80));
        list.add(new Student2("김자바", 1, 3, 80, 80, 90));
        list.add(new Student2("이자바", 1, 4, 70, 90, 70));
        list.add(new Student2("안자바", 1, 5, 60, 100, 80));

        Collections.sort(list);
        Iterator it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());
    }
}

