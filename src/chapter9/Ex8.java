package chapter9;

public class Ex8 {

    public static double round(double d, int n) {

        double tmp = Math.pow(10, n);

        return Math.round(d * tmp) / tmp;
    }

    public static void main(String[] args) {
        System.out.println(round(3.1415,1));
        System.out.println(round(3.1415,2));
        System.out.println(round(3.1415,3));
        System.out.println(round(3.1415,4));
        System.out.println(round(3.1415,5));
    }
}
