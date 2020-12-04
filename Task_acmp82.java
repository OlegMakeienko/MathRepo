import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task_acmp82 {

    void solve(Scanner in, PrintWriter out) {
        int sizeA = in.nextInt();
        int sizeB = in.nextInt();
        boolean [] a = new boolean[1 + 100000];
        boolean [] b = new boolean[1 + 100000];
        for (int i = 0; i < sizeA; i++) {
            a[in.nextInt()] = true;
        }
        for (int i = 0; i < sizeB; i++) {
            b[in.nextInt()] = true;
        }
        boolean first = true;
        for (int i = 0; i <= 100000; i++) {
            if (a[i] && b[i]) {
                if (first) {
                    first = false;
                } else {
                    System.out.print(" ");
                }
                System.out.print(i);
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


        new Task_acmp82().run();
    }
}
