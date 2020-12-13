import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task_acmp633 {

    void solve(Scanner in, PrintWriter out) {
        String teamName = in.nextLine();
        String [] members = new String[3];
        for (int i = 0; i < 3; i++) {
        members[i] = in.nextLine();
        }
        Arrays.sort(members);
        System.out.println(teamName + ": " + members[0] + ", " + members[1] + ", " + members[2]);
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


        new Task_acmp633().run();
    }
}
