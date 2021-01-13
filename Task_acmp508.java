import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp508 {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        long go = 0;
        for (int i = 0; i < n; i++) {
            char type = in.next().charAt(0);
            int outLeft = in.nextInt();
            int outRight = in.nextInt();
            int inLeft = in.nextInt();
            int inRight = in.nextInt();
            long crossAnswer = 0;
            crossAnswer += outLeft;
            go -= outLeft;
            go -= outRight;
            crossAnswer += go;
            crossAnswer += inLeft;
            go += inLeft;
            go += inRight;
            if (i > 0) {
                System.out.print(" ");
            }
            if (type == 'B') {
                System.out.print(crossAnswer);
            } else if (type == 'L') {
                System.out.print(-1);
            } else {
                throw new Error();
            }
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


        new Task_acmp508().run();
    }
}
