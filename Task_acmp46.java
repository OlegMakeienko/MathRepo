import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp46 {

    void solve(Scanner in, PrintWriter out) {
        StringBuilder sb = new StringBuilder("2.71828182845904523536028750");
        int n = in.nextInt();
        if (n == 0) {
            System.out.println("3");
            return;
        }
        char last = sb.charAt(n + 1);
        char after = sb.charAt(n + 2);
        if ('5' <= after && after <= '9') {
            last++;
        }
        sb.setCharAt(n + 1, last);
        System.out.println(sb.substring(0, n + 2));

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


        new Task_acmp46().run();
    }
}
