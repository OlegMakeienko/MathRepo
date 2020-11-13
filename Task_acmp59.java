import java.io.PrintWriter;
import java.util.Scanner;

/**
 перевод в любую систему исчисления
 */

public class Task_acmp59 {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int scale = in.nextInt();
        int p = 1;
        int sum = 0;
        while (n > 0) {
            int temp = n % scale;
            n /= scale;
            p *= temp;
            sum += temp;
        }
        System.out.println( p - sum);

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


        new Task_acmp59().run();
    }
}
