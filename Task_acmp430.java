import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Task_acmp430 {

    void solve(Scanner in, PrintWriter out) {
        double r = in.nextDouble();
        double latitude1 = in.nextDouble() / 180 * Math.PI; //переводим градусы в радианы
        double longitude1 = in.nextDouble() / 180 * Math.PI;
        double latitude2 = in.nextDouble() / 180 * Math.PI;
        double longitude2 = in.nextDouble() / 180 * Math.PI;
        double z1 = r * Math.sin(latitude1);
        double x1 = r * Math.cos(latitude1) * Math.cos(longitude1);
        double y1 = r * Math.cos(latitude1) * Math.sin(longitude1);
        double z2 = r * Math.sin(latitude2);
        double x2 = r * Math.cos(latitude2) * Math.cos(longitude2);
        double y2 = r * Math.cos(latitude2) * Math.sin(longitude2);
        double dx = x1 - x2;
        double dy = y1 - y2;
        double dz = z1 - z2;
        double dist = Math.sqrt(dx * dx + dy * dy + dz * dz);
        double alfa = 2 * Math.asin(Math.min(1, dist / 2 / r)); //корректируем, чтоб арксинус не взять от чуть больше 1
        double len = alfa * r;
        System.out.printf("%.2f", len);
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


        new Task_acmp430().run();
    }
}
