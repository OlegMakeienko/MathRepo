import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Task_acmp492 {

    void solve(Scanner in, PrintWriter out) {
        int x0 = in.nextInt();
        int y0 = in.nextInt();
        int vx = in.nextInt();
        int vy = in.nextInt();
        int v = in.nextInt();
        int t = in.nextInt();
        int d = in.nextInt();

        int xt = x0 + vx * t;
        int yt = y0 + vy * t;
        long dist2 = 1L * xt * xt + 1L * yt * yt;
        if(Math.abs(Math.sqrt(dist2) - d) <= v * t) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

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


        new Task_acmp492().run();
    }
}
