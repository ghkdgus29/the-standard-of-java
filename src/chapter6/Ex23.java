package chapter6;

import java.util.Arrays;

public class Ex23 {
    static int max(int[] arr) {
        int max = -999999;

        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(Arrays.toString(data));
        System.out.println("최대값: " + max(data));
        System.out.println("최대값: " + max(new int[]{}));
    }
}
