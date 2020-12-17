import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp231 {

    void solve(Scanner in, PrintWriter out) {
        int num = 0;
        int currLine = 0;
        for (char c :
             in.next().toCharArray()) {
            if('0' <= c && c <= '9') {
                num = num * 10 + (c - '0');
            } else if('A' <= c && c <= 'Z') {
                if (num == 0) {
                    num = 1;
                }
            for (int i = 0; i < num; i++) {
                System.out.print(c);
                currLine++; {
                    if( currLine == 40) {
                        System.out.println();
                        currLine = 0;
                    }
                }
            } num = 0;
            } else {
                throw new Error();
            }
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


        new Task_acmp231().run();
    }
}
