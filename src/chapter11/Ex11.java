package chapter11;

import java.util.HashSet;
import java.util.Objects;

public class Ex11 {
    public static void main(String[] args) {
        SutdaCard2 c1 = new SutdaCard2(3, true);
        SutdaCard2 c2 = new SutdaCard2(3, true);
        SutdaCard2 c3 = new SutdaCard2(1, true);
        HashSet set = new HashSet();
        set.add(c1);
        set.add(c2);
        set.add(c3);
        System.out.println(set);
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public boolean equals(Object obj) {
        if (obj instanceof SutdaCard2) {
            SutdaCard2 c = (SutdaCard2) obj;
            return num == c.num && isKwang == c.isKwang;
        } else {
            return false;
        }
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, isKwang);
    }
}