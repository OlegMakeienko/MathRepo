import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task_acmp693 {

    void solve(Scanner in, PrintWriter out) {
        char[] ch1 = in.next().toLowerCase().toCharArray();
        char[] ch2 = in.next().toLowerCase().toCharArray();

        // System.out.println("" + Arrays.toString(ch1) + Arrays.toString(ch2));
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        // System.out.println("" + Arrays.toString(ch1) + Arrays.toString(ch2));
        if(Arrays.equals(ch1,ch2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
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


        new Task_acmp693().run();
    }
}
