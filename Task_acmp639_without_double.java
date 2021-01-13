import java.io.PrintWriter;
import java.util.*;

public class Task_acmp639_without_double {

    static class Line{
        final int intRating;
        final String strRating;
        final String handle;

        Line(Scanner in) {
            strRating = in.next();
            handle = in.next();
            intRating = Integer.parseInt(strRating.replace(".",""));
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
        Collections.sort(lines, (left , right) -> right.intRating - left.intRating);
        System.out.println(lines.size());
        for (Line line : lines) {
            System.out.println(line.strRating + " " + line.handle);
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


        new Task_acmp639_without_double().run();
    }
}
