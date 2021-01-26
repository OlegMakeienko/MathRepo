import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task_acmp363 {
    static class Assert {
        static void check(boolean e) {
            if(!e) {
                throw new AssertionError();
            }
        }
    }

    static final int SIZE = 5001;
    int [] readNumber(Scanner in) {
        String s = in.next();
        int [] d = new int[SIZE];
        for (int i = 0; i < s.length(); i++) {
            Assert.check('0' <= s.charAt(i) && s.charAt(i) <= '9');
            d[s.length() - 1 - i] = s.charAt(i) - '0';
        }
        return d;
    }

    int getLen(int [] a) {
        int len = SIZE;
        while (len > 1 && a[len - 1] == 0) {
            len--;
        }
        return len;
    }

    int [] multiply(int []  a, int [] b) {
        Assert.check(a.length == SIZE && b.length == SIZE);
        int [] res = new int[SIZE];
        int lenA = getLen(a);
        int lenB = getLen(b);
        for (int ia = 0; ia < lenA; ia++) { // "нижнее" число
            int carry = 0;
            for (int ib = 0; ib < lenB; ib++) { // "верхнее" число ,,, когда умножаем в столбик,
                                                // то нижнее число умножается на каждую цифру верхнего числа
                carry += res[ia + ib] + a[ia] * b[ib];
                res[ia + ib] = carry % 10;
                carry /= 10;
            }
            if(carry > 0) {
                Assert.check(carry <= 9);
                Assert.check(res[ia + lenB] == 0);
                res[ia + lenB] = carry;
            }
        }
        return res;
    }

    String numberToString (int [] a) {
    int len = getLen(a);
        StringBuilder sb = new StringBuilder(len);
        for (int i = len - 1; i >= 0 ; i--) {
            sb.append((char) (a[i] + '0'));
        }
        return sb.toString();
    }

    void solve(Scanner in, PrintWriter out) {
        int [] a = readNumber(in); //читаем "длинное число"
        int [] b = readNumber(in);
        int [] p = multiply(a, b);
        System.out.println(numberToString(p));
    }

    void run() {
            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out);

            solve(in, out);

    }
    public static void main(String[] args) {


        new Task_acmp363().run();
    }
}
