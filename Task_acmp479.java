import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Task_acmp479 {

    double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    void solve(Scanner in, PrintWriter out) {
        double xStart = in.nextDouble();
        double yStart = in.nextDouble();
        double xFinish = in.nextDouble();
        double yFinish = in.nextDouble();
        double xTree = in.nextDouble();
        double yTree = in.nextDouble();
        double r = in.nextDouble();

        double sf = distance(xStart, yStart, xFinish, yFinish);
        double st = distance(xStart, yStart, xTree, yTree);
        double ft = distance(xTree, yTree, xFinish, yFinish);

        double bidAngel = Math.acos(Math.max(-1, Math.min(1 , (st * st + ft * ft - sf * sf) / (2 * st * ft))));
        double startAngel = Math.acos(Math.min(1, r / st));
        double finishAngel = Math.acos(Math.min (1, r / ft));
        double angel = bidAngel - startAngel - finishAngel;

        double dist;
        if(angel <= 0) {
            dist = sf;
        } else {
            dist = angel * r + Math.sqrt(Math.max(0, st * st - r * r)) + Math.sqrt(Math.max(0 , ft * ft - r * r));
        }
        System.out.printf("%.3f", dist);
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


        new Task_acmp479().run();
    }
}
