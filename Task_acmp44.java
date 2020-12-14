import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp44 {

    void solve(Scanner in, PrintWriter out) {
        String s;
        if (in.hasNext()) {
            s = in.next();
        } else {
            s = "";
        }
        int count = 0;
        for (int i = 0; i + 4 < s.length(); i++) { // не брать последние символы
            String sub = s.substring(i, i + 5);
            if ((sub.compareTo(">>-->") == 0) || (sub.compareTo("<--<<") == 0)) {
                count++;
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


        new Task_acmp44().run();
    }
}
