import java.io.PrintWriter;
import java.util.Scanner;

public class BigInteger_divide_without_BigInteger {
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

    int [] div(int []  a, int b) {
        Assert.check(1 <= b && b <= Integer.MAX_VALUE/10);
        int [] d = new int[SIZE];
        int rem = 0;
        for (int i = a.length - 1; i >= 0 ; i--) {
            rem = rem * 10 + a[i];
            d[i] = rem / b;
            rem %= b;
        }
        return d;
    }

    String numberToString (int [] a) {
        int len = SIZE;
        while (len > 1 && a[len - 1] == 0) {
            len--;
        }
        StringBuilder sb = new StringBuilder(len);
        for (int i = len - 1; i >= 0 ; i--) {
            sb.append((char) (a[i] + '0'));
        }
        return sb.toString();
    }

    void solve(Scanner in, PrintWriter out) {
        int [] a = readNumber(in); //читаем "длинное число"
        int b = in.nextInt();
        int [] d = div(a, b);
        System.out.println(numberToString(d));
    }

    void run() {
            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out);

            solve(in, out);

    }
    public static void main(String[] args) {


        new BigInteger_divide_without_BigInteger().run();
    }
}
