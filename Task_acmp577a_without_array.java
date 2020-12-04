import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp577a_without_array {

    void solve(Scanner in, PrintWriter out) {
        int sizeI = in.nextInt();
        int sizeJ = in.nextInt();
        for (int d = 0; d <= 9; d++) {
            int counter = 0;
            for (int i = 0; i <= sizeI; i++) {
                for (int j = 0; j <= sizeJ; j++) {
                    int t = i * j;
                    while (t > 0) {
                        if (t % 10 == d) {
                            counter++;
                        }
                        t /= 10;
                    }
                }
            }
            System.out.println(counter);
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


        new Task_acmp577a_without_array().run();
    }
}
