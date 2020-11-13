import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp147_Fibonachi_2 {

    void solve(Scanner in, PrintWriter out) {
        int x = in.nextInt();
        int prev = 0;
        int current = 1;
        for (int i = 0; i < x; i++) {
            int next = prev + current;
            prev = current;
            current = next;
            }
                System.out.println("The number Fibonachi whis position " + x + " is " + prev);
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


        new Task_acmp147_Fibonachi_2().run();
    }
}
