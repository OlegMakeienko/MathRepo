import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {

    }

    void run() {
        Locale.setDefault(Locale.US);

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


        new Template().run();
    }
}
