import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp163_Math_task  {

    void solve(Scanner in, PrintWriter out) {
        char [] s = in.next().toCharArray();
        if(s[1] == '-') {
            if(s[0] == 'x') { // x-a=b
                int a = s[2] - '0';
                int b = s[4] - '0';
                System.out.println(a + b);

            } else if(s[2] == 'x') { // a-x=b
                int a = s[0] - '0';
                int b = s[4] - '0';
                System.out.println(a - b);

            } else if(s[4] == 'x') { // a-b=x
                int a = s[0] - '0';
                int b = s[2] - '0';
                System.out.println(a - b);

            } else {
                throw new Error();
            }
        } else if (s[1] == '+') {
            if(s[0] == 'x') { // x+a=b
                int a = s[2] - '0';
                int b = s[4] - '0';
                System.out.println(b - a);

            } else if(s[2] == 'x') { // x+b=a
                int a = s[4] - '0';
                int b = s[2] - '0';
                System.out.println(a - b);

            } else if(s[4] == 'x') { // b+a=x
                int a = s[0 ] - '0';
                int b = s[2] - '0';
                System.out.println(a + b);

            } else {
                throw new Error();
            }

        } else {
            throw new Error();
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


        new Task_acmp163_Math_task().run();
    }
}
