package chapter9;

public class Ex6 {
    public static String fillZero(String src, int length) {
        String result = "";

        if (length > src.length()) {
            int count = 0;
            char[] buffer = new char[length-src.length()];

            while (count < length - src.length()) {
                buffer[count++] = '0';
            }

            result = String.valueOf(buffer);
            result += src;
        } else if (length > 0) {

            result = src.substring(0, length);
        }

        return result;
    }

    public static void main(String[] args) {
        String src = "12345";
        System.out.println(fillZero(src,10));
        System.out.println(fillZero(src,-1));
        System.out.println(fillZero(src,3));
    }
}
