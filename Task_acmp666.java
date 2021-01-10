import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp666 {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        for (int step = 26; step >=1 ; step--) {
            if (n == 1) {
                System.out.println((char)('a' + (step - 1)));
                return;
            } else if (n <= 1 << (step - 1)) {
                n--;
            } else {
                n -= 1 << (step - 1);
            }
        }
        throw new Error();

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


        new Task_acmp666().run();
    }
}
