import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_acmp347_Poker {

    void solve(Scanner in, PrintWriter out) {
        Random r = new Random();
        int [] poker = new int [5];
        for (int i = 0; i < 5; i++) {
            poker [i] = r.nextInt(13) + 1;
        }
        System.out.println(Arrays.toString(poker));

        int [] b = new int [1 +13];
        for (int  x : poker) {
            b[x]++;
        }
        int [] statistic = new int[1 + 5];
        for (int x : b) {
            statistic[x]++;
        }
        if (statistic[5] == 1) {
            System.out.println("Impossible");
        } else if (statistic[4] == 1) {
            System.out.println("Four of a Kind");
        } else if (statistic[3] == 1 && statistic[2] == 1) {
            System.out.println("Full House");
        } else if (statistic[3] == 1) {
            System.out.println("Three of a Kind");
        } else if (statistic[2] == 2) {
            System.out.println("Two Pairs");
        } else if (statistic[2] == 1) {
            System.out.println("One Pair");
        } else if (statistic[1] == 5) {
            int max = 0;
            int min = 14;
            for (int x: poker) {
                min = Math.min(min, x);
                max = Math.max(max, x);
            }
            if (max - min == 4) {
                System.out.println("Straight");
            } else {
            System.out.println("Nothing");
            }
        } else {
            throw new Error();
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


        new Task_acmp347_Poker().run();
    }
}
