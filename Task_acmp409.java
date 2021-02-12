import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Task_acmp409 {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int x1 = in.nextInt();
        int sum = 0;
        for (int i = 2; i < n; i++) {
            sum += in.nextInt();
        }
        int xn = in.nextInt();
        double ans = (sum + x1 / 2.0 + xn / 2.0) / (n - 1);
        System.out.printf("%.10f", ans);
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


        new Task_acmp409().run();
    }
}
