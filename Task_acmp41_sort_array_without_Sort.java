import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp41_sort_array_without_Sort {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int [] count = new int[100 + 1 + 100];
        for (int i = 0; i < n; i++) {
            count[in.nextInt() + 100]++;
        }
        boolean first = true;
        for (int value = -100; value <= 100 ; value++) {
            for (int i = 0; i < count[value + 100]; i++) {
                if (first) {
                    first = false;
                } else {
                    System.out.print(" ");
                }
                System.out.print(value);
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
