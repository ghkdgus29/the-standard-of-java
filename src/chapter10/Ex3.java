package chapter10;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Ex3 {
    public static void main(String[] args) throws ParseException {
        String given = "123,456,789.5";

        DecimalFormat df1 = new DecimalFormat("#,###.#");
        DecimalFormat df2 = new DecimalFormat("#");
        DecimalFormat df3 = new DecimalFormat("#,####");

        double givenNumber = df1.parse(given).doubleValue();

        String format1 = df2.format(givenNumber);
        String format2 = df3.format(givenNumber);

        System.out.println("data : " + given);
        System.out.println("반올림 : " + format1);
        System.out.println("만단위 : " + format2);
    }
}
