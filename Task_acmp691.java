import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp691 {
    boolean isLetter(char c) {
        return "ABCEHKMOPTXY".indexOf(c) >= 0;
    }

    boolean isDigit(char c) {
        return '0' <= c && c <= '9';
    }

    String nextline(Scanner in) {
        if (in.hasNextLine()) {
            return in.nextLine();
        } else {
            return  "";
        }
    }

    void solveOne(Scanner in, PrintWriter out) {
        String s = nextline(in);
        if (s.length() == 6 && isLetter(s.charAt(0)) && isDigit(s.charAt(1))
                            && isDigit(s.charAt(2)) && isDigit(s.charAt(3))
                            && isLetter(s.charAt(4)) && isLetter(s.charAt(5))) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        nextline(in);
        for (int i = 0; i < n; i++) {
            solveOne(in,out);
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


        new Task_acmp691().run();
    }
}
