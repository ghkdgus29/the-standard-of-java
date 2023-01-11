package chapter7;

public class Circle extends Shape{

    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    double calcArea() {
        return r * r * Math.PI;
    }
}
