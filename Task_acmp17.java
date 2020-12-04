import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp17 {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        for (int period = 1; period <= (n-1) ; period++) {
            if ((n-1) % period == 0) {
                boolean good = true;
                for (int i = period; i < n-1 ; i++) {
                    if (a[i] != a[i-period]) {
                        good = false;
                        break;
                    }
                }
                if (good) {
                    System.out.println(period);
                    return;
                }
            }
        }
        throw new Error();
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


        new Task_acmp17().run();
    }
}
