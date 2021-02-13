import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Task_acmp385 {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int [] x = new int[n];
        int [] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }
        Set<Double> distances = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int dx = x[i] - x[j];
                int dy = y[i] - y[j];
                distances.add(Math.sqrt(dx * dx + dy * dy));
            }
        }
        System.out.println(distances.size());
        for (double d : distances) {
            System.out.println(d);
        }
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


        new Task_acmp385().run();
    }
}
