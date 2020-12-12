import java.io.*;

public class super_rapid_Scanner {

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

        }
        int nextInt() {
            try {
                in.nextToken();
                Assert.check(in.ttype == StreamTokenizer.TT_NUMBER);
                int value = (int)in.nval;
                Assert.check(value == in.nval);
                return value;

            }
            catch (IOException e) {
                throw new IOError(e);
            }
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


        new super_rapid_Scanner().run();
    }
}
