import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp542 {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int result = 0;
        while (n != 0) {
            int digit = n % 2;
            n /= 2;
            result = result * 2 + digit;
        }
        System.out.println(result );

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


        new Task_acmp542().run();
    }
}
