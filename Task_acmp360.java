import java.io.*;

public class Task_acmp360 {

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
        byte [][] a = new byte[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (byte) in.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j + 2 < n; j++) {
                max = Math.max(max, a[i][j] + a[i][j + 1] + a[i][j + 2]);
            }
        }
        for (int i = 0; i + 2 < n; i++) {
            for (int j = 0; j < n; j++) {
                max = Math.max(max, a[i][j] + a[i + 1][j] + a[i + 2][j]);
            }
        }
        for (int i = 0; i + 1 < n; i++) {
            for (int j = 0; j + 1 < n; j++) {
                max = Math.max(max, a[i + 1][j] + a[i][j + 1] + a[i + 1][j + 1]);
                max = Math.max(max, a[i][j] + a[i][j + 1] + a[i + 1][j + 1]);
                max = Math.max(max, a[i][j] + a[i + 1][j] + a[i + 1][j + 1]);
                max = Math.max(max, a[i][j] + a[i + 1][j] + a[i][j + 1]);
            }
        }
        System.out.println(max);
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


        new Task_acmp360().run();
    }
}
