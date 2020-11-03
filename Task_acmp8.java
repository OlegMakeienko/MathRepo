import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp8 {

    void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (c == a * b) {
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


        new Task_acmp8().run();
    }
}
