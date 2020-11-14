import java.io.PrintWriter;
import java.util.Scanner;

/**
 task without  "exceptions"
 */
public class Task_acmp665_polindrom_time {

    void solve(Scanner in, PrintWriter out) {
        in.useDelimiter("(\\s|[:])+");
        int dm;
        {
            int h = in.nextInt();
            int m = in.nextInt();
            dm = h * 60 + m;
        }
        while (true) {
            dm = (dm + 1) % (24 * 60);
            int h = dm / 60;
            int m = dm % 60;
            int h1 = h / 10;
            int h2 = h % 10;
            int m1 = m / 10;
            int m2 = m % 10;
            if (h1 == m2 && h2 == m1) {
                System.out.println("" + h1 + h2 + ":" + m1 + m2);
                return;
            }
        }

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


        new Task_acmp665_polindrom_time().run();
    }
}
