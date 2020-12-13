import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp6_Horse_in_chess {

    void solve(Scanner in, PrintWriter out) {
            String s = in.nextLine();
            if(s.length() == 5 &&
                    'A' <= s.charAt(0) && s.charAt(0) <= 'H' &&
                    '1' <= s.charAt(1) && s.charAt(1) <= '8' &&
                    s.charAt(2) == '-' &&
                    'A' <= s.charAt(3) && s.charAt(3) <= 'H' &&
                    '1' <= s.charAt(4) && s.charAt(4) <= '8') {
                int dL = s.charAt(3) - s.charAt(0); // delta letter
                int dD = s.charAt(4) - s.charAt(1); // delta digit
                if(dL * dL + dD * dD == 5) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("Error");
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


        new Task_acmp6_Horse_in_chess().run();
    }
}
