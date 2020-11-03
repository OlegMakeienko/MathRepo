import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp324 {

    void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt();
        if (a / 1000 == a % 10  && a/ 100 % 10 == a / 10 % 10) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
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


        new Task_acmp324().run();
    }
}
