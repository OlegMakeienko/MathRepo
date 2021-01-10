import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp237 {

    void solve(Scanner in, PrintWriter out) {
        int size = in.nextInt();
        int words = in.nextInt();
        int [] count = new int[1 + 'Z'];
        for (int i = 0; i < size; i++) {
            for (char c : in.next().toCharArray()) {
                count[c]++;
            }
        }
        for (int i = 0; i < words; i++) {
            for (char c : in.next().toCharArray()) {
                count[c]--;
            }
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            while (count[c] > 0) {
                System.out.print(c);
                count[c]--;
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


        new Task_acmp237().run();
    }
}
