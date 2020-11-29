import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp313_with_rapid_Scanner {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int [] lastBus = new int[1 + 100];
        int maxDiff = 0;
        for (int min = 1; min < n; min++) {
            int route = in.nextInt();
            if (lastBus[route] != 0) {
                int diff = min - lastBus[route];
                maxDiff = Math.max(maxDiff, diff);
            }
            lastBus[route] = min;
        }
        System.out.println(maxDiff);
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


        new Task_acmp313_with_rapid_Scanner().run();
    }
}
