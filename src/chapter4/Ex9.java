package chapter4;

public class Ex9 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;


        for (int i = 0; i < str.length(); i++) {
//            sum += Integer.parseInt(str.substring(i, i + 1));
            sum += str.charAt(i) - '0';

        }

        System.out.println("sum = " + sum);
    }
}
