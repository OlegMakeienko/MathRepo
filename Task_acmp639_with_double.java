import java.io.PrintWriter;
import java.util.*;

public class Task_acmp639_with_double {

    static class Line{
        final double rating;
        final String handle;

        Line(Scanner in) {
            rating = in.nextDouble();
            handle = in.next();
        }
    }

    void solve(Scanner in, PrintWriter out) {
        int nRooms = in.nextInt();
        List <Line> lines = new ArrayList<>();
        for (int i = 0; i < nRooms; i++) {
            int nMen = in.nextInt();
            for (int j = 0; j < nMen; j++) {
                lines.add(new Line(in));
            }
        }
        lines.sort((left, right) -> Double.compare(right.rating, left.rating));
        System.out.println(lines.size());
        for (Line line : lines) {
            System.out.printf("%.2f %s%n", line.rating, line.handle);
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


        new Task_acmp639_with_double().run();
    }
}
