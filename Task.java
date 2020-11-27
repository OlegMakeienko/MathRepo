import java.io.PrintWriter;
import java.util.Scanner;

public class Task {

    void solve(Scanner in, PrintWriter out) {
        int [] a = new int[in.nextInt()];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        for (int i = a.length - 1; i >= 0 ; i--) {
            System.out.print(" " + a[i]);
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


        new Task().run();
    }
}
