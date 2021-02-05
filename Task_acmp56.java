import java.io.PrintWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class Task_acmp56 {
    TreeSet<String> readSet(Scanner in) {
        TreeSet<String> set = new TreeSet<>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            set.add(in.next());
        }
        return set;
    }

    void printSet(PrintWriter out, String name, TreeSet<String> set) {
        System.out.print(name + ":");
        boolean first = true;
        for (String item : set) {
            if(first) {
                System.out.print(" ");
                first = false;
            } else {
                System.out.print(", ");
            }
        System.out.print(item);
        }
        System.out.println();
    }

    void solve(Scanner in, PrintWriter out) {

        TreeSet<String> friends = readSet(in);
        TreeSet<String> friendOf = readSet(in);
        TreeSet<String> mutual = new TreeSet<>(friendOf);
        mutual.retainAll(friends);
        TreeSet<String> alsoFriendOf = new TreeSet<>(friendOf);
        alsoFriendOf.removeAll(friends);
        printSet(out, "Friends", friends);
        printSet(out,"Mutual friends", mutual);
        printSet(out,"Also friend of", alsoFriendOf);

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


        new Task_acmp56().run();
    }
}
