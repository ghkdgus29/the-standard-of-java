package chapter5;

public class Ex10 {
    public static void main(String[] args) {
        char[] abcCode =
                {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
                        '(', ')', '-', '_', '+', '=', '|', '[', ']', '{',
                        '}', ';', ':', ',', '.', '/'};
                        // 0    1    2    3    4    5    6    7    8    9
        char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};

        String src = "abc123";
        String result = "";

        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);

            if (Character.isDigit(ch)) {
                ch = numCode[ch - '0'];
            } else {
                ch = abcCode[ch - 'a'];
            }

            result += ch;
        }

        System.out.println("src : " + src);
        System.out.println("result : " + result);
    }
}
