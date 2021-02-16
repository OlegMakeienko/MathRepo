import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Task_acmp492Long {

    static class Assert {
        static void check(boolean e) {
            if(!e) {
                throw new Error();
            }
        }
    }

    boolean canHit(long x0, long y0, long vx, long vy, long v, long t, long d) {
        long xt = x0 + vx * t;
        long yt = y0 + vy * t;
        long dist2 = xt * xt  + yt * yt;
        if(dist2 >= d * d) {
           return dist2 <= (v * t + d) * (v * t + d);
        } else {
            return d - v * t < 0 || dist2 >= (d - v * t) * (d - v * t);
        }
    }

    void solve(Scanner in, PrintWriter out) {
        Assert.check(canHit(0, 0, 1000000, 0, 999999, 1000, 1000));
        Assert.check(!canHit(0, 1, 1000000, 0, 999999, 1000, 1000));
        int x0 = in.nextInt();
        int y0 = in.nextInt();
        int vx = in.nextInt();
        int vy = in.nextInt();
        int v = in.nextInt();
        int t = in.nextInt();
        int d = in.nextInt();
        if(canHit(x0, y0, vx, vy, v, t, d)){
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


        new Task_acmp492Long().run();
    }
}
