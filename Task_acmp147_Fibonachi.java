import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp147_Fibonachi {

    void solve(Scanner in, PrintWriter out) {
        int x = in.nextInt();
        int prev = 1;
        int current = 1;
        int position = 2;
        while (current < x) {
            int next = prev + current;
            prev = current;
            current = next;
            position ++;
        }
        if (x == current) {
            System.out.println("X is Fibonachi number and it place is " + position);
        } else {
        System.out.println( "X is not Fibonachi number");
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


        new Task_acmp147_Fibonachi().run();
    }
}
