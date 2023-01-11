package chapter9;

public class Ex10 {

    static String format(String str, int length, int alignment) {

        char[] src = str.toCharArray();

        if (length < str.length()) {
            return str.substring(0, length);
        }

        char[] buffer = new char[length];
        for (int i = 0; i < length; i++) {
            buffer[i] = ' ';
        }

        int add = 0;

        if (alignment == 0) {
            add = 0;
        } else if (alignment == 1) {
            add = (length - str.length()) / 2;
        } else {
            add = (length - str.length());
        }

        System.arraycopy(src, 0, buffer, add, src.length);
        return String.valueOf(buffer);

    }

    public static void main(String[] args) {
        String str = "가나다";
        System.out.println(format(str,7,0)); // 왼쪽 정렬
        System.out.println(format(str,7,1)); // 가운데 정렬
        System.out.println(format(str,7,2)); // 오른쪽 정렬
    }
}
