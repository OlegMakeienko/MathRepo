import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp303 {
   /* int maxSum (char [] a) {
        int sumEvens = 0;
        int sumOdd = 0;
        for (int i = 0; i < a.length; i += 2) {
            sumEvens += a[i];
        }
        for (int i = 1; i < a.length ; i +=2) {
            sumOdd += a[i];
        }
        return sumEvens - sumOdd;
    } */

    void solve(Scanner in, PrintWriter out) {
        char [] a;
        String s = in.next();
        a = s.toCharArray();
        String muxSum = "";
        for (int i = 0; i < a.length; i++) {
            String sum = s.substring(0, i) + s.substring(i + 1, s.length());
            if (sum.compareTo(muxSum) > 0) { // sum > muxSum
                muxSum = sum;
            }
        }
        System.out.println(muxSum);


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


        new Task_acmp303().run();
    }
}
