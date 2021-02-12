import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Task_acmp57 {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int cost = in.nextInt();
        long money = in.nextLong();
        int [] x = new int[n + 1];
        int [] y = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            double s = 0;
            for (int j = 0; j <= n ; j++) {
                int dx= x[i] - x[j];
                int dy= y[i] - y[j];
                s += Math.sqrt(dx * dx + dy * dy);
                }
                    if(s * cost <= money) {
                    System.out.println("YES");
                    return;
                }
            }
            System.out.println("NO");
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


        new Task_acmp57().run();
    }
}
