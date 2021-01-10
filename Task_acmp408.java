import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp408 {

    void solve(Scanner in, PrintWriter out) {
        int width = in.nextInt();
        String [] lines = new String[in.nextInt()];
        in.nextLine(); // прочитали до конца текущую строчку, где int был
        for (int i = 0; i < lines.length; i++) {
            lines[i] = in.nextLine().trim(); // убираем все символы <32
            if(lines[i].length() > width) {
                System.out.println("Impossible.");
                return;
            }
        }
        String spaces = "";
        for (int i = 0; i < width; i++) {
            spaces += " ";
        }
        for (String line : lines) {
            int rem = width - line.length();
            System.out.println(spaces.substring(0, rem / 2) + line + spaces.substring(0, rem - rem / 2));
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


        new Task_acmp408().run();
    }
}
