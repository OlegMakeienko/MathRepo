import java.io.PrintWriter;
import java.util.Scanner;

/**
 Lucky or not
 */

public class Task_acmp52 {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int a = n / 100000 % 10;
        int b = n / 10000 % 10;
        int c = n / 1000 % 10;
        int d = n / 100 % 10;
        int e = n / 10 % 10;
        int f = n % 10;

        if ( a + b + c == d + e + f) {
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


        new Task_acmp52().run();
    }
}
