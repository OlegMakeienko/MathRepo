import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp416_Horse_in_chess_2 {

    void solve(Scanner in, PrintWriter out) {
        String s = in.next();
        char letterHorse = s.charAt(0);
        char digitHorse = s.charAt(1);
        for (char letter = 'a'; letter <= 'z'; letter++) {
            for (char digit = '1'; digit <= '8' ; digit++) {
                int deltaLetter = letterHorse - letter;
                int deltaDigit = digitHorse - digit;
                if (deltaLetter * deltaLetter + deltaDigit * deltaDigit == 5) {
                    System.out.print("" + letter + digit + " ");
                }
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


        new Task_acmp416_Horse_in_chess_2().run();
    }
}
