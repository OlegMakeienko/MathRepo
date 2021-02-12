import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Task_acmp699 {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        double minTime = in.nextInt();
        int [] x = new int[n];
        int [] y = new int[n];
        int [] r = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
            y[i] = in.nextInt();
            r[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int dx = x[i] - x[j];
                int dy = y[i] - y[j];
                double tij = (Math.sqrt(dx * dx + dy * dy) - r[i] - r[j]) / 2;
                minTime = Math.min(minTime, tij);
            }
        }
        System.out.printf("%.2f", minTime);
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


        new Task_acmp699().run();
    }
}
