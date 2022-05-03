
import java.util.*;

public class test4 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 7;
        int nn = 1;
        int sp1 = 0;
        int sp2 = n - 2;
        while (nn <= (n / 2)) {
            printSpace(sp1);
            System.out.print("*");
            printSpace(sp2);
            System.out.print("*");
            nn++;
            sp1 += 1;
            sp2 -= 2;
            System.out.println();
        }

        printSpace((n / 2));
        System.out.print("*");
        System.out.println();

        sp1 = 2;
        sp2 = 1;
        nn = 1;
        while (nn <= (n / 2)) {
            printSpace(sp1);
            System.out.print("*");
            printSpace(sp2);
            System.out.print("*");
            nn++;
            sp1 -= 1;
            sp2 += 2;
            System.out.println();
        }
    }

    public static void printSpace(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }
}
