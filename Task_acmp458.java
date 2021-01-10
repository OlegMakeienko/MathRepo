import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp458 {

    void solve(Scanner in, PrintWriter out) {
        int nLines = in.nextInt();
        int [] order = new int[nLines];
        for (int i = 0; i < nLines; i++) {
            order[i] = in.nextInt() - 1;     // массив в задаче нумеруется с 1, а не с 0
        }
        String message = in.next();
        int baseWidth = message.length() / nLines;
        int nLongerLines = message.length() % nLines;
        char [][] a = new char[nLines][];
        for (int i = 0; i < nLines; i++) {
            if(i < nLongerLines) {
                a[i] = new char[baseWidth + 1];
            } else {
                a[i] = new char[baseWidth];
            }
        }
        int pos = 0;
        for (int i : order) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = message.charAt(pos);
                pos++;
            }
        }
        for (int j = 0; j < baseWidth + 1; j++) {
            for (int i = 0; i < nLines; i++) {
                if (j < a[i].length) {
                    System.out.print(a[i][j]);
                }
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


        new Task_acmp458().run();
    }
}
