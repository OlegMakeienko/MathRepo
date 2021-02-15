import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Task_acmp362 {

    boolean fits(double ph, double pw, double eh, double ew) {
        if(ph > pw) {
            return fits(pw, ph, eh, ew);
        }
        if(eh > ew) {
            return fits(ph, pw, ew, eh);
        }
        if(ph <= eh && pw <= ew) {
            return true;
        }
        if(ph >= eh) {
            return false;
        }
        if(ph * ph + pw * pw >= eh * eh + ew * ew) {
            return false;
        }
        double oa = Math.sqrt(ph * ph + pw * pw) / 2;
        double ob = eh / 2;
        double ab = Math.sqrt(oa * oa - ob * ob);
        double ac = ew / 2 - ab;
        double od = oa;
        double oe = ew / 2;
        double de = Math.sqrt(od * od - oe * oe);
        double cd = eh / 2 - de;
        double ad = Math.sqrt(ac * ac + cd * cd);
        return ad >= ph * (1 - 1e-14);
    }

    void solve(Scanner in, PrintWriter out) {
        double ph = in.nextInt();
        double pw = in.nextInt();
        double eh = in.nextInt();
        double ew = in.nextInt();
        if(fits(ph, pw, eh ,ew)) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
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


        new Task_acmp362().run();
    }
}
