import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp637 {

    void solve(Scanner in, PrintWriter out) {
        int [] a = new int[in.nextInt()];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }

        int max = in.nextInt();
        int count = 0;
        for (int x:
             a) {
            count += Math.min(max,x);
        }
        System.out.println(count);
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


        new Task_acmp637().run();
    }
}
