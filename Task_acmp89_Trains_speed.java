import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp89_Trains_speed {

    int divRoundNearest (int a, int b) {
        return (a + b/2) / b;
    }

    int timeToMinutes (String s) {
        int h10 = s.charAt(0) - '0';
        int h1 = s.charAt(1) - '0';
        int m10 = s.charAt(3) - '0';
        int m = s.charAt(4) - '0';
        return (h10 * 10 + h1) * 60 + m10 * 10 + m;
    }

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        in.nextLine();
        String bestName = null;
        int bestTime = 24 * 60 +1;
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            int begin = timeToMinutes(s.substring(s.length() - 11, s.length() - 6));
            int end = timeToMinutes(s.substring(s.length() - 5));
            int time;
            if (begin < end) {
                time = end - begin;
            } else {
                time = end + 24 * 60 - begin;
            }
            if (time < bestTime) {
                bestTime = time;
                bestName = s.substring(0, s.length() - 12);
            }
        }
        System.out.println("The fastest train is " + bestName);
        System.out.println("Its speed is " + divRoundNearest(650 * 60, bestTime) + " km/h, approximately."); // округление вверх по формуле (a+b/2)/b
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


        new Task_acmp89_Trains_speed().run();
    }
}
