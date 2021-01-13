import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp543 {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int weight = in.nextInt();
        int delta = in.nextInt();
        int sumWeight = in.nextInt();
        int allRealWeight = n * (n - 1) / 2 * weight;
        int basket0 = (allRealWeight - sumWeight) / delta;  //0...n-1
        int basket1 = (basket0 + n - 1) % n + 1; // 1....n
        System.out.println(basket1);
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


        new Task_acmp543().run();
    }
}
