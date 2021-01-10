import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp102_S_triangle_truth_vector {

    static class Point {
        final int x;
        final int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        Point(Scanner in) {
            x = in.nextInt();
            y = in.nextInt();
        }
    }

    int area2(Point p1, Point p2, Point p3) {
        return Math.abs((p2.x - p1.x)*(p3.y - p1.y) - (p3.x - p1.x)*(p2.y - p1.y)); // площадь треугольника через векторы
    }

    void solve(Scanner in, PrintWriter out) {
        Point p1 = new Point(in);
        Point p2 = new Point(in);
        Point p3 = new Point(in);
        Point p = new Point(in);

        int s = area2(p1, p2, p3);
        int s12 = area2(p ,p1, p2);
        int s23 = area2(p, p2, p3);
        int s13 = area2(p, p1, p3);
        if(s == s12 + s23 + s13) {
            System.out.println("In");
        } else {
            System.out.println("Out");
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


        new Task_acmp102_S_triangle_truth_vector ().run();
    }
}
