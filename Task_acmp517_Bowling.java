import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp517_Bowling {

    void solve(Scanner in, PrintWriter out) {
        int [] tablo = new int[in.nextInt()];
        for (int i = 0; i < tablo.length; i++) {
            tablo [i] = in.nextInt();
        }
        int sum = 0;
        int pos = 0;
        for (int round = 1; round <= 10; round++) {
            if (tablo[pos] == 10) {
                sum += tablo[pos] + tablo[pos + 1] + tablo[pos + 2];
                pos ++;
            } else if (tablo[pos] + tablo[pos + 1] == 10) {
                sum += tablo[pos] + tablo[pos + 1] + tablo[pos + 2];
                pos += 2;
            } else {
                sum += tablo[pos] + tablo[pos + 1];
                pos += 2;
            }
        }
        System.out.println(sum);

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


        new Task_acmp517_Bowling().run();
    }
}
