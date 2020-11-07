import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp148 {

    void solve(Scanner in, PrintWriter out) {
        int k = in.nextInt();
        for (int i = 0; i < k; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println("\n" + (19*b + (a + 239)*(a + 366)/2));
        }

    }

    void run() {
        try {
            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out, true);

            solve(in, out);
            }
            catch (Exception e) {
                e.printStackTrace();
        }
    }
    public static void main(String[] args) {


        new Task_acmp148().run();
    }
}
