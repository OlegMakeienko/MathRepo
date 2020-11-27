import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp531 {

    void solve(Scanner in, PrintWriter out) {
        long minX = in.nextLong();
        long minY = in.nextLong();
        long maxX = in.nextLong();
        long maxY = in.nextLong();
        long xc = in.nextLong();
        long yc = in.nextLong();
        long r = in.nextLong();
        minX -= xc;
        minY -= yc;
        maxX -= xc;
        maxY -= yc;
        xc = 0;
        yc = 0;
        long y = 0;
        long count = 0;
        for (long x = -r; x <=r ; x++) {
            while ((y+1) * (y+1) + x * x <= r * r) {
                y++;
            }
            while (y * y + x * x > r * r) {
                y--;
            }
            if (minX <= x && x <= maxX) {
                // -y y || minY maxY
                 if (!(y < minY || maxX < -y)) {
                    count  += Math.min(y, maxY) - Math.max(-y, minY) + 1;
                 }
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


        new Task_acmp531().run();
    }
}
