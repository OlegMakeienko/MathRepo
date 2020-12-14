import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp48_use_char_insteadOf_int {

    void solve(Scanner in, PrintWriter out) {
        String s = in.next();
        System.out.println('1');
        for (int i = s.length() -1; i >= 0 ; i--) {
            if( s.charAt(i) == '0') {
                System.out.println('0');
            } else break;
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


        new Task_acmp48_use_char_insteadOf_int().run();
    }
}
