package chapter6;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Ex6 {
    static double getDistance(int x, int y, int x1, int y1) {

        return sqrt(pow(x1 - x, 2) + pow(y1 - y, 2));
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }
}
