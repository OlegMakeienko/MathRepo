import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp41 {

    void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int first [] = new int[a];
        int second [] = new int[b];
        int c = Math.max(a, b);
        for (int i = 0; i < first.length; i++) {
            first[i] = in.nextInt();
        }
        for (int i = 0; i < second.length; i++) {
            second[i] = in.nextInt();
        }
        for (int i = 0; i < c; i++) {
            if (first[i] == second[i]) {
                System.out.println(1);
            }
            else {
                System.out.println(0);
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


        new Task_acmp41().run();
    }
}
