import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp91 {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int [] a = new int[1 + Math.max(4, n)];
        int [] b = new int[1 + Math.max(4, n)];
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 7;
        b[1] = 1;
        b[2] = 5;
        b[3] = 6;
        b[4] = 8;
        int bi = 4;
        for (int ai = 5; ai <= n ; ai++) {
             a[ai] = b[ai - 1] + b[ai - 3];
            for (int i = a[ai - 1] + 1; i <a[ai] ; i++) {
                if (bi <= n) {
                    b[bi] = i;
                    bi++;
                }
            }
        }
        System.out.println(a[n]);
        System.out.println(b[n]);
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


        new Task_acmp91().run();
    }
}
