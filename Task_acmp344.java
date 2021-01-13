import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task_acmp344 {

    static class Point {
        final int x;
        final int pos;

        Point(int x, int pos) {
            this.x = x;
            this.pos = pos;
        }
    }

    void solve(Scanner in, PrintWriter out) {
        Point [] p = new Point[in.nextInt()];
        for (int i = 0; i < p.length; i++) {
            p[i] = new Point(in.nextInt(), i + 1); //координата и позиция
        }
        Arrays.sort(p, (left, right) -> left.x - right.x);
        int minDist = Integer.MAX_VALUE;
        int left = -1;
        int right = -1;
        for (int i = 0; i + 1 < p.length ; i++) {
            int dist = p[i + 1].x - p[i].x;
            if(dist < minDist) {
                minDist = dist;
                left = p[i].pos;
                right = p[i + 1].pos;
            }
        }
        System.out.println(minDist);
        System.out.println(left + " " + right);
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


        new Task_acmp344().run();
    }
}
