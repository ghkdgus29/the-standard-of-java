package chapter10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex2 {

    static int paycheckCount(Calendar from, Calendar to) {
        boolean timeSame = (from.get(Calendar.YEAR) == to.get(Calendar.YEAR) && from.get(Calendar.MONTH) == to.get(Calendar.MONTH) && from.get(Calendar.DATE) == to.get(Calendar.DATE));

        if (timeSame && from.get(Calendar.DATE) == 21) {
            return 1;
        }
        if (timeSame) {
            return 0;
        }

        int monDiff = (to.get(Calendar.YEAR) - from.get(Calendar.YEAR)) * 12 + to.get(Calendar.MONTH) - from.get(Calendar.MONTH);

        if (from.get(Calendar.DATE) > 21 && to.get(Calendar.DATE) < 21) {
            monDiff--;
        }
        if (from.get(Calendar.DATE) < 21 && to.get(Calendar.DATE) > 21) {
            monDiff++;
        }

        return Math.max(monDiff, 0);
    }

    static void printResult(Calendar from, Calendar to) {
        Date fromDate = from.getTime();
        Date toDate = to.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.print(sdf.format(fromDate)+" ~ " +sdf.format(toDate)+":");
        System.out.println(paycheckCount(from, to));
    }

    public static void main(String[] args) {
        Calendar fromCal = Calendar.getInstance();
        Calendar toCal = Calendar.getInstance();
        fromCal.set(2010,0,1);
        toCal.set(2010,0,1);
        printResult(fromCal, toCal);
        fromCal.set(2010,0,21);
        toCal.set(2010,0,21);
        printResult(fromCal, toCal);
        fromCal.set(2010,0,1);
        toCal.set(2010,2,1);
        printResult(fromCal, toCal);
        fromCal.set(2010,0,1);
        toCal.set(2010,2,23);
        printResult(fromCal, toCal);
        fromCal.set(2010,0,23);
        toCal.set(2010,2,21);
        printResult(fromCal, toCal);
        fromCal.set(2011,0,22);
        toCal.set(2010,2,21);
        printResult(fromCal, toCal);
    }
}
