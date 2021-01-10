import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp303_plusMinusSum {
    int plusMinusSum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int d = s.charAt(i) - '0';
            if (i % 2 == 0) {
                sum += d;
            } else {
                sum -= d;
            }
        }
        return sum;
    }

    void solve(Scanner in, PrintWriter out) {
        String s = in.next();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            max = Math.max(max, plusMinusSum(s.substring(0, i) + s.substring(i + 1)));
        }
        System.out.println(max);


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


        new Task_acmp303_plusMinusSum().run();
    }
}
