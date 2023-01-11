package chapter5;

public class Ex4 {
    public static void main(String[] args) {

        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30}
        };

        int total = 0;
        float average = 0;

        for (int[] ints : arr) {
            for (int i : ints) {
                total += i;
            }
        }
        average = total / (float) 20;

        System.out.println("total = " + total);
        System.out.println("average = " + average);

    }
}
