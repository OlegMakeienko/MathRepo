import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Task_acmp69 {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int a = in.nextInt();
        double diff = a / 2.0 / Math.sin(Math.PI / n) - a / 2.0 / Math.tan(Math.PI / n);
        if(diff < 1) {
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


        new Task_acmp69().run();
    }
}
