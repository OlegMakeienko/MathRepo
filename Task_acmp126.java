import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp126 {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int [][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) { // first square
            for (int j = (i + 1); j < n; j++) { // second square
                for (int k = (j + 1); k < n; k++) { //third square
                    minLen = Math.min(minLen, a[i][j] + a[j][k] + a[k][i]);
                }
            }
        }
        System.out.println(minLen);
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


        new Task_acmp126().run();
    }
}
