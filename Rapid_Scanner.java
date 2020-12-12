import java.io.*;

public class Rapid_Scanner {

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


        new Rapid_Scanner().run();
    }
}
