import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp576_NOD_like_metod {

    int gcd (int a, int b) {

        while (b != 0) {
            int temp = a % b;
            a = b;
            b =temp;
        }
        return a;
    }

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int count = 0;
        for (int d = 1; d < n; d++) {
            if ( gcd(d,n) == 1) {
                count++;
            }
        }
        System.out.println(count);

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


        new Task_acmp576_NOD_like_metod().run();
    }
}
