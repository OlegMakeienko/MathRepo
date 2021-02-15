import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Task_acmp37 {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        double q = in.nextDouble();
        for (int i = 0; i < n; i++) {
            int x0 = in.nextInt();
            int y0 = in.nextInt();
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            if(Math.sqrt(x1 * x1 + y1 * y1) > q * Math.sqrt(x0 * x0 + y0 * y0) * (1 + 1e-15)) { // домножаю на епсилон,
                                                                                             // чтоб не были равны при
                                                                                            // округлении
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
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


        new Task_acmp37().run();
    }
}
