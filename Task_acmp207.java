import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Task_acmp207 {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        double x = 0;
        double y = 0;
        for (int i = 0; i < n; i++) {
            int dir = in.nextInt();
            int step = in.nextInt();
            if(dir == 1) {
                y += step;
            } else if(dir == 2) {
                x += step / Math.sqrt(2);
                y += step / Math.sqrt(2);
            } else if(dir == 3) {
                x += step;
            } else if(dir == 4) {
                x += step / Math.sqrt(2);
                y -= step / Math.sqrt(2);
            } else if(dir == 5) {
                y -= step;
            } else if(dir == 6) {
                x -= step / Math.sqrt(2);
                y -= step / Math.sqrt(2);
            } else if(dir == 7) {
                x -= step;
            } else if(dir == 8) {
                x -= step / Math.sqrt(2);
                y += step / Math.sqrt(2);
            } else {
                throw new Error();
            }
        }
        System.out.printf("%.3f %.3f", x, y);
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


        new Task_acmp207().run();
    }
}
