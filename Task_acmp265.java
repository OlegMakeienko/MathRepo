import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp265 {

    void solve(Scanner in, PrintWriter out) {
        boolean cut [][] = new boolean[1 + 8 + 1][1 + 8 + 1];
        int n = in.nextInt();
        for (int cell = 0; cell < n; cell++) {
            int i = in.nextInt();
            int j = in.nextInt();
            cut[i][j] = true;
        }
        int count = 0;
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= 8 ; j++) {
                if(cut[i][j] != cut[i + 1][j]) {
                    count++;
                }
                if(cut[i][j] != cut[i][j + 1]) {
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


        new Task_acmp265().run();
    }
}
