import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp534 {

    void solve(Scanner in, PrintWriter out) {
        int [] numbersOfKeys = new int[1 + in.nextInt()];
        for (int i = 1; i < numbersOfKeys.length; i++) {
            numbersOfKeys [i] = in.nextInt();
        }
        int [] numbersOfClicks = new int[in.nextInt()];
        for (int i = 0; i < numbersOfClicks.length; i++) {
            numbersOfClicks [i] = in.nextInt();
        }
        for (int i = 1; i < numbersOfKeys.length; i++) {
            for (int j = 1; j < numbersOfClicks.length; j++) {
                if (i == numbersOfClicks[j]) {
                    numbersOfKeys [i] --;
                }
            }
                if (numbersOfKeys[i] < 0) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
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


        new Task_acmp534().run();
    }
}
