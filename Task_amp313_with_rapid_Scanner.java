import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Task_amp313_with_rapid_Scanner {

    static class Assert {
        static void check (boolean e) {
            if (!e) {
                throw new AssertionError();
            }
        }
    }

    static class Scanner implements AutoCloseable {

        StreamTokenizer in;

        Scanner (InputStream is) {
            in = new StreamTokenizer(new InputStreamReader(new BufferedInputStream(is)));
            in.resetSyntax();
            in.whitespaceChars(0, 32);
            in.wordChars(33, 255);
        }
        String next() {
            try {
                in.nextToken();
                Assert.check(in.ttype == StreamTokenizer.TT_WORD);
                return in.sval;
            }
            catch (IOException e) {
                throw new IOError(e);
            }
        }
        int nextInt() {
            return Integer.parseInt(next());
        }

        @Override
        public void close() {

        }
    }

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int [] lastBus = new int[1 + 100];
        int maxDiff = 0;
        for (int min = 1; min < n; min++) {
            int route = in.nextInt();
            if (lastBus[route] != 0) {
                int diff = min - lastBus[route];
                maxDiff = Math.max(maxDiff, diff);
            }
            lastBus[route] = min;
        }
        System.out.println(maxDiff);
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


        new Task_amp313_with_rapid_Scanner().run();
    }
}
