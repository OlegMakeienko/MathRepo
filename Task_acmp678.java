import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp678 {

    void solve(Scanner in, PrintWriter out) {
        String input;
        if (in.hasNextLine()) {
            input = in.nextLine();
        } else {
            input = "";
        }
        int pos = 1;
        for (char c :
             input.toCharArray()) {
            if (c == 'A') {
                if (pos == 1) {
                    pos = 2;
                } else if (pos == 2) {
                    pos = 1;
                }
            } else if (c == 'B') {
                if (pos == 2) {
                    pos = 3;
                } else if (pos == 3) {
                        pos = 2;
                    }
            } else if (c == 'C') {
                if (pos == 1) {
                    pos = 3;
                } else if (pos == 3) {
                    pos = 1;
                }
            } else {
                throw new Error();
            }
        }
        System.out.println(pos);

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


        new Task_acmp678().run();
    }
}
