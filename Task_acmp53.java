import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp53 {

    void solve(Scanner in, PrintWriter out) {
        int count = 0;
        for ( char c :
             in.next().toCharArray()) {
            if (c == '8') {
                count += 2;
            } else if (c == '6' || c == '9' || c == '0') {
                count++;
            }
        }
        System.out.println(count);

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


        new Task_acmp53().run();
    }
}
