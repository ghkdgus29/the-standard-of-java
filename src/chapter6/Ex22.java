package chapter6;

public class Ex22 {

    static boolean isNumber(String str) {
        boolean check = true;

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                check = false;
            }
        }

        return check;
    }

    public static void main(String[] args) {

        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));

        str = "123o5";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }
}
