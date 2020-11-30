import java.io.*;

public class Task_amp313_with_super_rapid_Scanner {

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


        new Task_amp313_with_super_rapid_Scanner().run();
    }
}
