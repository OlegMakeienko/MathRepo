import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Task_acmp375 {

    void solve(Scanner in, PrintWriter out) {
        int from = in.nextInt();
        int to = in.nextInt();
        BigInteger a = in.nextBigInteger(from);
        System.out.println(a.toString(to).toUpperCase());
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


        new Task_acmp375().run();
    }
}
