import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp643_Key {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int n0 = n;
        int count = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                count++;
            }
            n /= 2;
        }
        System.out.println(n0 + count);

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


        new Task_acmp643_Key().run();
    }
}
