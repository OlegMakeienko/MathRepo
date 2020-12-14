import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp44a {

    void solve(Scanner in, PrintWriter out) {
        String s;
        if (in.hasNext()) {
            s = in.next();
        } else {
            s = "";
        }
        int count = 0;
        {
        int pos = -1;
        while (true)

    {
        pos = s.indexOf(">>-->", pos + 1);
        if (pos == -1) {
            break;
        }
        count++;
    }
        }
            {
                int pos = -1;
                while (true)

                {
                    pos = s.indexOf("<--<<", pos + 1);
                    if (pos == -1) {
                        break;
                    }
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


        new Task_acmp44a().run();
    }
}
