import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp496 {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int sumN = 0;
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int prev = a1;
        int current = a2;
            for (int i = 2; i < n; i++) {
                int next = in.nextInt();
                sumN = Math.max(sumN, prev + current + next);
                prev = current;
                current = next;
        }
            sumN = Math.max(sumN, a1 + a2 + current);
            sumN = Math.max(sumN, prev + current + a1);
            System.out.println(sumN);

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


        new Task_acmp496().run();
    }
}
