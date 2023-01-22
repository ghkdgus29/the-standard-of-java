package chapter13;

public class Ex5 {
    public static void main(String[] args) throws Exception {
        Thread3 th1 = new Thread3();
        th1.start();

        try {
            Thread.sleep(5 * 1000);
        } catch (Exception e) {

        }

        throw new Exception("Boom!!!");
    }
}

class Thread3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }
}
