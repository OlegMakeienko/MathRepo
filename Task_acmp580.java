import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Task_acmp580 {

    void solve(Scanner in, PrintWriter out) {
        double a = in.nextInt();
        double b = in.nextInt();
        double c = in.nextInt();
        double r = in.nextInt();
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p -a) * (p -b) * (p -c));
        if(r <= s / p) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
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


        new Task_acmp580().run();
    }
}
