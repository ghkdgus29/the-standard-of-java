package chapter6;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MyPoint {
    int x;
    int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(int x1, int y1) {
        return sqrt(pow(x1 - x, 2) + pow(y1 - y, 2));
    }
}
