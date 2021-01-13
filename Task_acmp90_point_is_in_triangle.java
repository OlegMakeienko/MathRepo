import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_acmp90_point_is_in_triangle {

    static class Point {
        final int x;
        final int y;

        Point(Scanner in) {
            x = in.nextInt();
            y = in.nextInt();
        }
    }

    int area2(Point a, Point b, Point c) {
        return Math.abs((b.x - a.x)*(c.y - a.y) - (c.x - a.x)*(b.y - a.y)); // площадь треугольника через векторы
    }

    void solve(Scanner in, PrintWriter out) {
        Point p = new Point(in);
        int countries = in.nextInt();
        List<Integer> answer = new ArrayList<>();
        for (int i = 1; i <= countries; i++) {
            Point p1 = new Point(in);
            Point p2 = new Point(in);
            Point p3 = new Point(in);

                int s12 = area2(p ,p1, p2);
                int s23 = area2(p, p2, p3);
                int s31 = area2(p, p3, p1);
                if(area2(p1, p2 , p3) == s12 + s23 + s31 && s12 > 0 && s31 > 0 && s23 > 0) {
                    answer.add(i);
                }
        }
            System.out.println(answer.size());

            for (int i = 0; i < answer.size(); i++) {
                if(i > 0) {
                    System.out.print(" ");
                }
                System.out.print(answer.get(i));
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


        new Task_acmp90_point_is_in_triangle().run();
    }
}
