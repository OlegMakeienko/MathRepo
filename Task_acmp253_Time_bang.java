import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp253_Time_bang {

    void solve(Scanner in, PrintWriter out) {
        int h = in.nextInt();
        int m = in.nextInt();
        int hEnd = in.nextInt();
        int mEnd = in.nextInt();
        int count = 0;
        while (h != hEnd || m != mEnd) {
            if (m == 30) {
                count++;
            } else if (m == 0) {
                count += (h + 12 - 1) % 12 + 1;
            }
            m++;
            h += m / 60;
            m %= 60;
            h %= 24;
        }
        System.out.println(count);
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


        new Task_acmp253_Time_bang().run();
    }
}
