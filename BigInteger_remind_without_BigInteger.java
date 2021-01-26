import java.io.PrintWriter;
import java.util.Scanner;

public class BigInteger_remind_without_BigInteger {
    static class Assert {
        static void check(boolean e) {
            if(!e) {
                throw new AssertionError();
            }
        }
    }

    static final int SIZE = 101;
    int [] readNumber(Scanner in) {
        String s = in.next();
        int [] d = new int[SIZE];
        for (int i = 0; i < s.length(); i++) {
            Assert.check('0' <= s.charAt(i) && s.charAt(i) <= '9');
            d[s.length() - 1 - i] = s.charAt(i) - '0';
        }
        return d;
    }

    long rem(int []  a, long b) {
        Assert.check(1 <= b && b <= Long.MAX_VALUE/10);
        long rem = 0;
        for (int i = a.length - 1; i >= 0 ; i--) {
            rem = (rem * 10 + a[i]) % b;
        }
        return rem;
    }

    String numberToString (int [] a) {
        int len = SIZE;
        while (len > 1 && a[len - 1] == 0) {
            len--;
        }
        StringBuilder sb = new StringBuilder(len);
        for (int i = len - 1; i >= 0 ; i--) {
            sb.append(a[i] + '0');
        }
        return sb.toString();
    }

    void solve(Scanner in, PrintWriter out) {
        int [] a = readNumber(in); //читаем "длинное число"
        int b = in.nextInt();
        long r = rem(a, b);
        System.out.println(r);
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


        new BigInteger_remind_without_BigInteger().run();
    }
}
