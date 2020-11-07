import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp81 {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int myMellon = Integer.MIN_VALUE;
        int motherMellon = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            myMellon = Math.max(myMellon, a);
            motherMellon = Math.min(motherMellon, a);
        }
        System.out.println("My waterMellon is " + myMellon + " kg.");
        System.out.println("My mother-in-law waterMellon weight " + motherMellon + " kg.");
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


        new Task_acmp81().run();
    }
}
