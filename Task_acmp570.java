import java.io.PrintWriter;
import java.util.Scanner;

public class Task_acmp570 {

    void solve(Scanner in, PrintWriter out) {
        int sizeI = in.nextInt();
        int sizeJ = in.nextInt();
        char [][] a = new char[sizeI][];
        for (int i = 0; i < sizeI; i++) {
            a[i] = in.next().toCharArray();
        }
        int minI = Integer.MAX_VALUE;
        int maxI = Integer.MIN_VALUE;
        int minJ = Integer.MAX_VALUE;
        int maxJ = Integer.MIN_VALUE;

        for (int i = 0; i < sizeI; i++) {
            for (int j = 0; j < sizeJ; j++) {
                if (a[i][j] == '*') {
                    minI = Math.min(minI, i);
                    maxI = Math.max(maxI, i);
                    minJ = Math.min(minJ, j);
                    maxJ = Math.max(maxJ, j);
                }

            }
        }
            if (minI < Integer.MAX_VALUE) {
                for (int sMinI = minI - 1; sMinI <= minI + 1 ; sMinI++) {
                    for (int sMaxI = maxI - 1; sMaxI <= maxI + 1 ; sMaxI++) {
                        for (int sMinJ = minJ - 1; sMinJ <= minJ ; sMinJ++) {
                            for (int sMaxJ = maxJ - 1; sMaxJ <= maxJ ; sMaxJ++) {
                                if (sMaxI - sMinI == sMaxJ - sMinI 
                                        && sMaxI - sMinI >=2 
                                        && 0 < sMinI && sMaxI < sizeI 
                                        && 0 < sMinJ && sMaxJ < sizeJ) {
                                    boolean isBlackInside = true;
                                    for (int i = sMinI + 1; i < sMaxI - 1 && isBlackInside; i++) {
                                        for (int j = sMinJ + 1; j < sMaxJ -1 && isBlackInside; j++) {
                                            if (a[i][j] != '*') {
                                                isBlackInside = false;
                                            }

                                        }
                                        
                                    }
                                    if(isBlackInside){
                                        System.out.println("SQUARE");
                                    }
                                }
                            }
                        }
                    }
            }
        }
        System.out.println("CIRCLE");
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


        new Task_acmp570().run();
    }
}
