import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task_acmp98 {

    void solve(Scanner in, PrintWriter out) {
        int [] array = new int[in.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        int first = 0;
        int last = array.length - 1;
        int sum1 = 0;
        int sum2 = 0;
        int turn = 1;

        while (first <= last) {
            if (array[first] >= array[last]) {
                if (turn == 1) {
                    sum1 += array[first];
                } else {
                    sum2 += array[first];
                }
             first++;
            }
            else {
                if (turn == 1) {
                    sum1 += array[last];
                } else {
                    sum2 += array[last];
                }
                last--;
            }
            turn = 3 - turn;
        }
        System.out.println(sum1 + ":" + sum2);

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


        new Task_acmp98().run();
    }
}
