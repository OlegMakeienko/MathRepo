import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Task_acmp40_outputTime_test {

    void solve(Scanner in, PrintWriter out) {
        long start = System.nanoTime();
        int n = 1_000_000;
        BigInteger _1 = BigInteger.ONE;
        BigInteger res = _1.shiftLeft(n);
        System.out.println(res.intValue());
        String s = res.toString();
        System.out.println(s.length());
        System.out.println((System.nanoTime() - start) / 1_000_000_000.0 + " s");

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


        new Task_acmp40_outputTime_test().run();
    }
}
