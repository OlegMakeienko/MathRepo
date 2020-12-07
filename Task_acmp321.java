import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp321 {

    int countDigit(int n, int scale, int d) {
        int count = 0;
        while (n > 0) {
            if (n % scale == d) {
                count++;
            }
            n /= scale;
        }
        return count;
    }

    boolean hasEqualDigits(int n, int  scale) {
        for (int d = 0; d < scale; d++) {
            if (countDigit(n, scale ,d) > 1) {
                return true;
            }
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


        new Task_acmp321().run();
    }
}