import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Task_acmp144 {

    void solve(Scanner in, PrintWriter out) {
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        BigInteger p = a.multiply(b);
        System.out.println(p);

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


        new Task_acmp144().run();
    }
}
