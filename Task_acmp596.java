import java.io.PrintWriter;
import java.util.*;

public class Task_acmp596 {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        String [] name = new String[n];
        int [] x = new int[n];
        int [] y = new int[n];
        int [] r = new int[n];
        for (int i = 0; i < n; i++) {
            name[i] = in.next();
            x[i] = in.nextInt();
            y[i] = in.nextInt();
            r[i] = in.nextInt();
        }
        int xa = in.nextInt();
        int ya = in.nextInt();
        Map<String, Integer> count = new TreeMap<>();
        List<String> added = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int dx = x[i] - xa;
            int dy = y[i] - ya;
            if(!count.containsKey(name[i])){
                count.put(name[i], 0);
                added.add(name[i]);
            }
            if(dx * dx + dy * dy <= r[i] * r[i]) {
                count.put(name[i], count.get(name[i]) + 1);
            }
        }
        System.out.println(added.size());
        for (String s:
             added) {
            System.out.println(s + " " + count.get(s));

        }
    }

    void run() {
        Locale.setDefault(Locale.US);

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


        new Task_acmp596().run();
    }
}
