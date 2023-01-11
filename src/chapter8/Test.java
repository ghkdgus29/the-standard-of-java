package chapter8;

public class Test {
    public static void main(String[] args) {

        try {
            System.out.println("try");
            throw new Error("에러발생");

        } catch (IllegalStateException e) {
            System.out.println("catch");
//            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }
}
