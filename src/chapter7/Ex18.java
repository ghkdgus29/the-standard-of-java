package chapter7;

public class Ex18 {

    static void action(Robot r) {
        if (r instanceof DanceRobot) {
            ((DanceRobot) r).dance();
        }

        if (r instanceof SingRobot) {
            ((SingRobot) r).sing();
        }

        if (r instanceof DrawRobot) {
            ((DrawRobot) r).draw();
        }
    }

    public static void main(String[] args) {
        Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};

        for (Robot robot : arr) {
            action(robot);
        }
    }
}
