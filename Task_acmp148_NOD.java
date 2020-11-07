import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp148_NOD {

    void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        while (b != 0) {
            int temp = a % b;
            a = b;
            b =temp;
        }
        System.out.println(a);

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


        new Task_acmp148_NOD().run();
    }
}
