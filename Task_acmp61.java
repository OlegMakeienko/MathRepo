import java.io.PrintWriter;
import java.util.Scanner;

/**
 Известны результаты каждой из 4х четвертей баскетбольной встречи.
 Нужно определить победителя матча. Побеждает команда, набравшая больше очков в течение всего матча.

 Входные данные:
 Входной файл INPUT.TXT содержит 4 строки, в каждой строке находится два целых числа a и b – итоговый счет
 в соответствующей четверти.
 а – количество набранных очков за четверть первой командой,
 b – количество очков, набранных за четверть второй командой.
 (0 ≤ a,b ≤ 100).

 Выходные данные:
 В выходной файл OUTPUT.TXT выведите номер выигравшей команды, в случае ничьей следует вывести «DRAW».
 */

public class Task_acmp61 {

    void solve(Scanner in, PrintWriter out) {
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int a3 = in.nextInt();
        int b3 = in.nextInt();
        int a4 = in.nextInt();
        int b4 = in.nextInt();

        if (a1 + a2 + a3 + a4 > b1 + b2 + b3 + b4) {
            System.out.println("Team A won!");
        } else   if (a1 + a2 + a3 + a4 < b1 + b2 + b3 + b4) {
            System.out.println("Team B won!");
        } else {
            System.out.println("DRAW");
        }

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

        new Task_acmp61().run();
    }
}
