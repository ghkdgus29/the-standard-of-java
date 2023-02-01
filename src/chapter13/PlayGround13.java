package chapter13;

public class PlayGround13 {
    public static void main(String[] args) {

        Thread t = new Thread(() -> {
            System.out.println("야호");       // 람다식 사용
        });

        t.setDaemon(true);  // 데몬 쓰레드 true 로 설정
        t.start();          // 쓰레드 실행
    }
}

