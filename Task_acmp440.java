import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Task_acmp440 {

    void solve(Scanner in, PrintWriter out) {
        int [] x = new int[5];
        int [] y = new int[5];
        for (int i = 0; i < 5; i++) {
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }
        int count = 0;
        for (int targetX = 0; targetX <= 100 ; targetX += 25) {
            for (int i = 0; i < 5; i++) {
                int dx = x[i] - targetX;
                int dy = y[i];
                if(dx * dx + dy * dy <= 10 * 10){
                   count++;
                   break;
                }
            }
        }
        System.out.println(count);
    }

    void run() {
        Locale.setDefault(Locale.US);

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


        new Task_acmp440().run();
    }
}
