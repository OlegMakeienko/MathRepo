import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp577 {

    void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int [] count = new int[10];
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                int t = i * j;
                while (t > 0) {
                count [t % 10] ++;
                t /= 10;
                }
            }
        }
        for (int d:
             count) {
            System.out.println(d);
        }
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


        new Task_acmp577().run();
    }
}
