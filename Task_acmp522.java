import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class  Task_acmp522 {

    void solve(Scanner in, PrintWriter out) {
        int size1 = in.nextInt();
        int size2 = in.nextInt();
        boolean [] set1 = new boolean[32000 + 1 + 32000];
        for (int i = 0; i < size1; i++) {
            set1[in.nextInt() + 32000] = true;
        }
        boolean [] set2 = new boolean[32000 + 1 + 32000];
        for (int i = 0; i < size2; i++) {
            set2[in.nextInt() + 32000] = true;
        }
        if (Arrays.equals(set1,set2)) {
            System.out.println(1);
        } else {
            System.out.println(0);
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


        new Task_acmp522().run();
    }
}
