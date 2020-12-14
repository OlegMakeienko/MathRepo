import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp548 {

    void solve(Scanner in, PrintWriter out) {
        String s1 = in.next() + ":";
        String s2 = in.next() + ":";
        String res = "";
        while (s1.length() > 1 || s2.length() > 2) { // ?
            if (s1.compareTo(s2) < 0 ) {
                res += s1.charAt(0);
                s1 = s1.substring(1);
            } else {
                res += s2.charAt(0);
                s2 = s2.substring(1);
            }
        }
        System.out.println(res);
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


        new Task_acmp548().run();
    }
}
