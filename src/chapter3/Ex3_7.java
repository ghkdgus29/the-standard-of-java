package chapter3;

public class Ex3_7 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = (float) 5 / 9 * (fahrenheit - 32);

        System.out.println("fahrenheit = " + fahrenheit);
        System.out.println("celcius = " + String.format("%.2f", celcius));
    }
}
