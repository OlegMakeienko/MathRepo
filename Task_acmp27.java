import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp27 {

    void solve(Scanner in, PrintWriter out) {
        int sizeJ = in.nextInt();
        int sizeI = in.nextInt();
        boolean [][] painted = new boolean[sizeI][sizeJ];
        int quantity = in.nextInt();
        for (int rectangle = 0; rectangle < quantity; rectangle++) {
            int minJ = in.nextInt();
            int minI = in.nextInt();
            int maxJ = in.nextInt() - 1;
            int maxI = in.nextInt() - 1;
            for (int i = minI; i <= maxI; i++) {
                for (int j = minJ; j <= maxJ; j++) {
                    painted [i][j] = true;
                }
            }
        } int count = 0;
        for (int i = 0; i < sizeI; i++) {
            for (int j = 0; j < sizeJ; j++) {
                if (!painted[i][j]) {
                    count++;
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


        new Task_acmp27().run();
    }
}
