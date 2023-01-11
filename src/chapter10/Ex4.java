package chapter10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("입력하신 날짜는 E요일입니다.");

        System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력예:2007/05/11)");

        while (sc.hasNextLine()) {
            try {
                Date date = sdf1.parse(sc.nextLine());
                System.out.println(sdf2.format(date));
                return;
            } catch (ParseException e) {
                System.out.println("날짜를 yyyy/MM/dd의 형태로 입력해주세요.(입력예:2007/05/11)");
            }
        }
    }
}
