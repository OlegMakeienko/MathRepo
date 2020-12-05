import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp321_with_logic_array {

    boolean hasEqualDigits(int n, int  scale) {
        boolean [] wasDigit = new boolean[scale];
        while (n > 0) {
            int d = n % scale;
            n /= scale;
            if (wasDigit[d]) {
                return true;
            }
            wasDigit[d] = true;
        }
        return false;
    }

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        boolean first = true;
        for (int scale = 2; scale <= 36 ; scale++) {
            if(!hasEqualDigits(n, scale)) {
                if (first) {
                    first = false;
                } else {
                    System.out.print(" ");
                }
                System.out.print(scale);
            }
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


        new Task_acmp321_with_logic_array().run();
    }
}
