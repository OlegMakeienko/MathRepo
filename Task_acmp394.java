import java.io.PrintWriter;
import java.util.Scanner;

/**
 minimum slice to one man
 n/НОД(n,m)
 */
public class Task_acmp394 {

    void solve(Scanner in, PrintWriter out) {
        int friends = in.nextInt();
        int orange  = in.nextInt();
        int a = friends;
        int b = orange;
        while (b != 0) {
            int temp = a % b;
             a = b;
             b = temp;
        }
        int gcd = a;
        System.out.println(friends / gcd);
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


        new Task_acmp394().run();
    }
}
