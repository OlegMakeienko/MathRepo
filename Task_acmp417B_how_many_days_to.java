import java.io.PrintWriter;
import java.util.Scanner;

/**
 With array in answer in SOUT.
 */

public class Task_acmp417B_how_many_days_to {

    void solve(Scanner in, PrintWriter out) {
        int nDays = in.nextInt();
        int weekDay = 2;
        int day = 1;
        int month = 1;
        int year = 2008;
        for (int i = 0; i < nDays; i++) {
            int daysInFebruary;
            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
                daysInFebruary = 29;
            } else {
                daysInFebruary = 28;
            }
            int daysInTheMonth;
            if (month == 2){
                daysInTheMonth = daysInFebruary;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                daysInTheMonth = 30;
            } else {
                daysInTheMonth = 31;
            }
            if (day == 31 && month == 12){
                year++;
                day = 1;
                month = 1;
            } else if (day == daysInTheMonth) {
                day = 1;
                month++;
            } else {
                day++;
            }
            if (weekDay < 7) {
                weekDay++;
            } else {
                weekDay = 1;
            }
        }
        System.out.printf("%s, %02d.%02d", new String[] {"Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"} [(1 + nDays) % 7], day, month);
        System.out.print("." + year);
    }

    void run() {
        try {
            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out);

            solve(in, out);
            }
            catch (Exception e) {
                e.printStackTrace();
        }
    }
    public static void main(String[] args) {


        new Task_acmp417B_how_many_days_to().run();
    }
}
