package chapter9;

public class Ex4 {
    static void printGraph(int[] dataArr, char ch) {
        for (int i : dataArr) {
            for (int j = 0; j < i; j++) {
                System.out.print(ch);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printGraph(new int[]{3, 7, 1, 4}, '*');
    }
}
