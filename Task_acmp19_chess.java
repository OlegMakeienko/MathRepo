import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp19_chess {

    void solve(Scanner in, PrintWriter out) {
        String queen = in.next();
        char queenLetter = queen.charAt(0);
        char queenDigit = queen.charAt(1);
        String rook = in.next();
        char rookLetter = rook.charAt(0);
        char rookDigit = rook.charAt(1);
        String horse = in.next();
        char horseLetter = horse.charAt(0);
        char horseDigit = horse.charAt(1);
         int count = 0;
        for (char letter = 'A'; letter <= 'H'; letter++) {
            for (char digit = '1'; digit <= '8'; digit++) {
                if (
                        !(letter == queenLetter && digit == queenDigit ||
                        letter == rookLetter && digit == rookDigit ||
                        letter == horseLetter && digit == horseDigit)
                            &&
                                ((letter - horseLetter) * (letter - horseLetter) + (digit - horseDigit) *(digit - horseDigit) == 5 ||
                                letter == rookLetter || digit == rookDigit ||
                                letter == queenLetter ||digit == queenDigit || Math.abs(letter - queenLetter) == Math.abs(digit - queenDigit))
                ) {
                    count++;
                }
            }
        }
        System.out.println(count);
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


        new Task_acmp19_chess().run();
    }
}
