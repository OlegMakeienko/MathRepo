import java.io.PrintWriter;
import java.util.Scanner;

/**
 Ириска весит X грамм, мандарин – Y грамм, пряник – Z грамм.
 Требуется написать программу, которая определит,
 сколько различных вариантов подарков весом ровно W грамм может сделать Дед Мороз.
 */
public class Task_acmp317 {

    void solve(Scanner in, PrintWriter out) {
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int w = in.nextInt();
        int count = 0;
        for (int ix = 0; ix * x <= w; ix++) {
            for (int iy = 0; ix * x + iy * y <= w; iy++) {
                if ((w - ix * x - iy * y) % z == 0) {
                    count++;
                }
               // for (int iz = 0; ix * x + iy * y + iz * z  <= w; iz++) {
               //     if(ix * x + iy * y + iz * z == w) {
               //         count++;
               //     }
               // }

            }
            
        }
        System.out.println(count);
        

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


        new Task_acmp317().run();
    }
}
