package chapter7;

public class Ex23 {

    public static double sumArea(Shape[] arr) {
        double sum = 0;
        for (Shape shape : arr) {
            sum += shape.calcArea();
        }

        return sum;
    }

    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
        System.out.println("면적의 합:" + sumArea(arr));

    }
}
