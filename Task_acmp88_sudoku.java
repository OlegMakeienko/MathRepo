import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp88_sudoku {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int [][] sudoku3x3 = new int[n * n][n * n];
        for (int i = 0; i < n * n; i++) {
            for (int j = 0; j < n * n; j++) {
                sudoku3x3[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n * n; i++) {
            boolean[] was = new boolean[1 + 100];
            for (int j = 0; j < n * n; j++) {
                was[sudoku3x3[i][j]] = true;
            }
            for (int x = 1; x <= n * n; x++) {
                if (!was[x]) {
                    System.out.println("incorrect");
                return;
                }
            }
        }
        for (int j = 0; j < n * n; j++) {
            boolean [] was = new boolean[1 + 100];
            for (int i = 0; i < n * n; i++) {
                    was[sudoku3x3[i][j]] = true;
            }
            for (int x = 1; x <= n * n ; x++) {
                if(!was[x]) {
                    System.out.println("incorrect");
                 return;
                }
            }

        }
        for (int i0 = 0; i0 < n * n; i0 += n) {
            for (int j0 = 0; j0 < n * n; j0 += n) {
            boolean [] was = new boolean[1 + 100];
                for (int i = i0; i < i0 + n; i++) {
                    for (int j = j0; j <j0 + n; j++) {
                        was[sudoku3x3[j][j]] = true;
                    }
                }
                for (int x = 1; x <= n * n ; x++) {
                    if (!was[x]) {
                        System.out.println("incorrect");
                    return;
                    }
                }

            }

        }
        System.out.println("correct");

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


        new Task_acmp88_sudoku().run();
    }
}
