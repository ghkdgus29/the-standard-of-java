package chapter9;

public class Ex12 {

    static int getRand(int from, int to) {
        int max = Math.max(from, to);
        int min = Math.min(from, to);
        int diff = max - min + 1;

        int rand = (int) (Math.random() * diff) + min;
        return rand;
    }

    public static void main(String[] args) {
        for(int i=0; i< 20; i++)
            System.out.print(getRand(1,-3)+",");
    }
}
