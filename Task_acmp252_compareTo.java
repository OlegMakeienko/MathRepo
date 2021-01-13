import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task_acmp252_compareTo {

    static class Mass implements Comparable <Mass> {
        final int originalValue;
        final String originalUnits;
        final int mantissa;
        final int exponent;

         Mass(Scanner in) {
            originalValue = in.nextInt();
            originalUnits = in.next();
            int mantissa;
            int exponent;
             if(originalUnits.compareTo("mg") == 0){
                 mantissa = originalValue;
                 exponent = 0;
             } else if(originalUnits.compareTo("g") == 0){
                 mantissa = originalValue;
                 exponent = 3;
            } else if(originalUnits.compareTo("kg") == 0){
                 mantissa = originalValue;
                 exponent = 6;
            } else if(originalUnits.compareTo("Mg") == 0){
                 mantissa = originalValue;
                 exponent = 9;
            } else if(originalUnits.compareTo("Gg") == 0){
                 mantissa = originalValue;
                 exponent = 12;
            } else if(originalUnits.compareTo("mp") == 0){
                 mantissa = originalValue * 16380;
                 exponent = 0;
             } else if(originalUnits.compareTo("p") == 0){
                 mantissa = originalValue * 16380;
                 exponent = 3;
             } else if(originalUnits.compareTo("kp") == 0){
                 mantissa = originalValue * 16380;
                 exponent = 6;
             } else if(originalUnits.compareTo("Mp") == 0){
                 mantissa = originalValue * 16380;
                 exponent = 9;
             } else if(originalUnits.compareTo("Gp") == 0){
                 mantissa = originalValue * 16380;
                 exponent = 12;
             } else if(originalUnits.compareTo("mt") == 0){
                 mantissa = originalValue;
                 exponent = 6;
             } else if(originalUnits.compareTo("t") == 0){
                 mantissa = originalValue;
                 exponent = 9;
             } else if(originalUnits.compareTo("kt") == 0){
                 mantissa = originalValue;
                 exponent = 12;
             } else if(originalUnits.compareTo("Mt") == 0){
                 mantissa = originalValue;
                 exponent = 15;
             } else if(originalUnits.compareTo("Gt") == 0){
                 mantissa = originalValue ;
                 exponent = 18;
             } else {
                 throw new Error();
             }
             while (mantissa < 100_000_000) {
                 mantissa *= 10;
                 exponent--;
             }
             this.mantissa = mantissa;
             this.exponent = exponent;
        }

        public int compareTo(Mass second) {
            if (this.exponent != second.exponent) {
                return this.exponent - second.exponent;
            } else {
                return this.mantissa - second.mantissa;
            }
        }

        @Override
        public String toString() {
            return originalValue +
                    " " + originalUnits;
        }
    }

    void solve(Scanner in, PrintWriter out) {

        int n = in.nextInt();
        Mass[] m = new Mass[n];
        for (int i = 0; i < m.length; i++) {
            m[i] = new Mass(in);
        }
        Arrays.sort(m);
        for (Mass a : m) {
            System.out.println(a);
        }
    }

    void run() {
        try {
            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out);

            solve(in, out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {


        new Task_acmp252_compareTo().run();
    }
}
