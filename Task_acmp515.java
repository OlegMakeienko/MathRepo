import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Task_acmp515 {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int xp = 0;
        int yp = 0;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int dx = x - xp;
            int dy = y - yp;
            sum += Math.sqrt(dx * dx + dy * dy);
            xp = x;
            yp = y;
        }
        sum += Math.sqrt(xp * xp + yp * yp);
        System.out.printf("%.3f", sum);
    }

    void run() {
        Locale.setDefault(Locale.US);

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


        new Task_acmp515().run();
    }
}
