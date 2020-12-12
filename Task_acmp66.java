import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp66 {

    void solve(Scanner in, PrintWriter out) {
        String keyboard = "qwertyuiopasdfghjklzxcvbnmq";
        String oldKey = in.next();
        int pos = keyboard.indexOf(oldKey);
        System.out.println(keyboard.charAt(pos +1));

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


        new Task_acmp66().run();
    }
}
