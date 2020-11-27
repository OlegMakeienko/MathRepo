import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp349_simple_numbers {

        boolean isSimple (int n) {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return n > 1;
        }

    void solve(Scanner in, PrintWriter out) {
            int first = in.nextInt();
            int last = in.nextInt();
            boolean absent = true;
        for (int i = first; i <= last; i++) {
                if(isSimple(i)) {
                    System.out.println(i);
                    absent = false;
                }
        }
        if (absent) {
            System.out.println("Absent");
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


        new Task_acmp349_simple_numbers().run();
    }
}
