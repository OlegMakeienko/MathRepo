import java.io.PrintWriter;
import java.util.Scanner;

public class Task_char_toUpperCase {

    void solve(Scanner in, PrintWriter out) {
            String line = "организация объединённых наций";
            char[] chars = line.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (i == 0 || chars[i - 1] == ' ') {
                    chars[i] = Character.toUpperCase(chars[i]);
                }
            }
            System.out.println(new String(chars));
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


        new Task_char_toUpperCase().run();
    }
}
