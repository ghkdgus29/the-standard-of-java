package chapter9;

public class Ex9 {

    static String delChar(String src, String delCh) {
        String result = "";
        for (int i = 0; i < src.length(); i++) {
            if (delCh.indexOf(src.charAt(i)) == -1) {
                result += src.charAt(i);
            }
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)"+" -> "
                + delChar("(1!2@3^4~5)","~!@#$%^&*()"));
        System.out.println("(1 2 3 4\t5)"+" -> "
                + delChar("(1 2 3 4\t5)"," \t"));
    }
}
