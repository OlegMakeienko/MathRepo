import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp597 {

    void solve(Scanner in, PrintWriter out) {
        int r1 = in.nextInt();
        int r2 = in.nextInt();
        int r3 = in.nextInt();

        if (r2 + r3 < r1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
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


        new Task_acmp597().run();
    }
}
