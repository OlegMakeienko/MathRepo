import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp367a {    //возведение в степень

    void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int n = in.nextInt();
        int [] d = new int[7000];
        d[0] = 1;
        for (int p = 0; p < n; p++) {
            int carry = 0;
            for (int i = 0; i < d.length; i++) {
                carry = carry + d[i] * a;
                d[i] = carry % 10;
                carry /= 10;
            }
            if(carry != 0) {
                throw new Error();
            }
        }
        int last = d.length - 1;
        while (last > 0 && d[last] == 0) {
            last--;
        }
        for (int i = last; i >= 0 ; i--) {
            System.out.print(d[i]);
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


        new Task_acmp367a().run();
    }
}
