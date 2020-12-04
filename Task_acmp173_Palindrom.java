import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp173_Palindrom {

    int reverse (int n, int scale) {
        int res = 0;
        while (n > 0) {
            res *= scale;
            res += n % scale;
            n /= scale;
        }
        return res;
    }

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int count = 0;
        int first = -1;
        for (int scale = 2; scale <= 36 ; scale++) {
            if (n == reverse(n,scale)) {
                if (count == 0) {
                    count = 1;
                    first = scale;
                } else if (count == 1) {
                    count = 2;
                    System.out.println("multiple ");
                    System.out.print(first + " " + scale);
                } else {
                    System.out.println(" " + scale);
                }
            }
        }
            if (count == 0) {
                System.out.println("none");
            } else if (count == 1) {
                System.out.println("unique");
                System.out.println(first);
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


        new Task_acmp173_Palindrom().run();
    }
}
