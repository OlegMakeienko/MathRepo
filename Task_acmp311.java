import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class Task_acmp311 {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        BigInteger p = BigInteger.ONE;
        BigInteger sum = p;
        for (int i = 2; i <= n ; i++) {
            p = p.multiply(BigInteger.valueOf(i));
            sum = sum.add(p);
        }
        // System.out.println(p);
        System.out.println(sum);

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


        new Task_acmp311().run();
    }
}
