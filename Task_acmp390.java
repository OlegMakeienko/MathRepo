import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Task_acmp390 {

    static class Point {
        int x;
        int y;

        Point(Scanner in) {
            x = in.nextInt();
            y = in.nextInt();
        }
        double distanceTo(Point second) {
            int dx = this.x - second.x;
            int dy = this.y - second.y;
            return Math.sqrt(dx * dx + dy * dy);
        }
    }

    int area2(Point a, Point b, Point c) {
        return Math.abs((b.x - a.x) * (c.y - a.y) - (c.x - a.x) * (b.y - a.y));
    }

    double getHigth(Point top, Point a, Point b) {
        return area2(top, a, b) / a.distanceTo(b);
    }

    void solve(Scanner in, PrintWriter out) {
        Point p1 = new Point(in);
        Point p2 = new Point(in);
        Point p3 = new Point(in);
        Point c = new Point(in);
        System.out.printf("%.7f", Math.min(getHigth(c, p1, p2),Math.min(getHigth(c, p2, p3),getHigth(c, p3, p1))));

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


        new Task_acmp390().run();
    }
}
