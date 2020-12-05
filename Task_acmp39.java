import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp39 {

    void solve(Scanner in, PrintWriter out) {
        int [] prises = new int[in.nextInt()];
        for (int i = 0; i < prises.length; i++) {
            prises [i] = in.nextInt();
        }
        int max = 0;
        int sum = 0;
        for (int i = prises.length - 1; i >= 0; i--) {
            max = Math.max(max, prises[i]);
            sum += max;
        }
        System.out.println(sum);
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


        new Task_acmp39().run();
    }
}
