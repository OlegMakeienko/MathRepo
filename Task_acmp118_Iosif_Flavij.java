import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp118_Iosif_Flavij {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int step = in.nextInt();
        int pos = 0;
        for (int len = 2; len <= n; len++) {
             pos = (step + pos) % len;
        }
        System.out.println(pos + 1);
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


        new Task_acmp118_Iosif_Flavij().run();
    }
}
